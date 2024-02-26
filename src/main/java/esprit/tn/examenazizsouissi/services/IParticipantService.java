package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Participant;

import java.util.List;
import java.util.Set;

public interface IParticipantService {
    public Participant ajouterParticipant (Participant p);
    public List<Participant> getParReservLogis ();
}
