package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Evenement;

public interface IEvenementService {
    public Evenement ajoutAffectEvenParticip (Evenement e);
    public void calculCout ();
}
