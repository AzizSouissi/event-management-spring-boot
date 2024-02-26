package com.example.ski.Repositories;

import com.example.ski.Entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkieurRep extends CrudRepository<Skieur, Long> {
    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement abonnement_typeAbonnement);
    List<Skieur> findByAbonnementTypeAbonnementAndPistesCouleurAndInscriptionsCourseSupportAndInscriptionsCourseTypeCours(TypeAbonnement abonnement_typeAbonnement, Couleur pistes_couleur, Support inscriptions_course_support, TypeCours inscriptions_course_typeCours);
    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "JOIN inscription i ON s.num_skieur = i.skieur_num_skieur " +
            "JOIN moniteur_courses mc ON c.num_cours = mc.courses_num_cours " +
            "JOIN moniteur m ON m.num_moniteur = mc.moniteur_num_moniteur " +
            "WHERE m.nomm = :MoniteurName ", nativeQuery = true)
    List<Skieur> findSkieurByMoniteurNamesql(String MoniteurName);
    @Query("SELECT i.skieur " +
            "FROM Inscription i " +
            "JOIN Moniteur m ON i.course member m.courses " +
            "WHERE m.nomM = :MoniteurName " +
            "GROUP BY i.skieur " +
            "ORDER BY COUNT(i.skieur.pistes) DESC ")
    List<Skieur> findSkieurByMoniteurNamejpql(String MoniteurName);
}
