package esprit.tn.examenazizsouissi.repositories;

import esprit.tn.examenazizsouissi.entities.Logistique;
import esprit.tn.examenazizsouissi.entities.Participant;
import esprit.tn.examenazizsouissi.entities.Tache;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface ParticipantRep extends CrudRepository<Participant, Long> {
    List<Participant> getParticipantsByTache(Tache tache);
}
