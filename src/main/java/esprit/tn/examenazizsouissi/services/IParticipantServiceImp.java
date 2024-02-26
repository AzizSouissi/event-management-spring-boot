package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Participant;
import esprit.tn.examenazizsouissi.entities.Tache;
import esprit.tn.examenazizsouissi.repositories.ParticipantRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IParticipantServiceImp implements IParticipantService {
    private final ParticipantRep participantRep;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participantRep.save(p);
    }

    @Override
    public List<Participant> getParReservLogis() {
        List<Participant> participants = participantRep.getParticipantsByTache(Tache.ORGANISATEUR);
        List<Participant> participantList = new ArrayList<>();
        for (Participant participant : participants) {
            if (participant.getEvenements() != null) {
                participantList.add(participant);
            }
        }
        return participantList;
    }
}
