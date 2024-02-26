package com.example.ski.Repositories;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.TypeAbonnement;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface AbonnementRep extends CrudRepository<Abonnement, Long> {
    Set<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);
    List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findByDateDebutAfterAndDateFinBefore(LocalDate dateDebut, LocalDate dateFin);
}
