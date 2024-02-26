package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Logistique;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ILogistiqueService {
    public Logistique ajoutAffectLogEvnm (Logistique l, String descriptionEvnmt);
    public Set<Logistique> getLogistiquesDates (LocalDate dateDeb, LocalDate dateFin);
}
