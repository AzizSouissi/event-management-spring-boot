package esprit.tn.examenazizsouissi.repositories;

import esprit.tn.examenazizsouissi.entities.Evenement;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface EvenementRep extends CrudRepository<Evenement, Long> {
    Optional<Set<Evenement>> getEvenementsByDescription(String description);
}
