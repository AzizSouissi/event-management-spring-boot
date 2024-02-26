package esprit.tn.examenazizsouissi.repositories;

import esprit.tn.examenazizsouissi.entities.Logistique;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface LogistiqueRep extends CrudRepository<Logistique, Long> {
    @Query("select e.logistiques " +
            "from Evenement e " +
            "where e.dateDebut=:dateDeb and e.dateFin=:dateFin ")
    Set<Logistique> getLogistiquesDates(@Param("dateDeb") LocalDate dateDeb, @Param("dateFin") LocalDate dateFin);
}
