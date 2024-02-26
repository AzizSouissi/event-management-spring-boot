package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Evenement;
import esprit.tn.examenazizsouissi.entities.Logistique;
import esprit.tn.examenazizsouissi.repositories.EvenementRep;
import esprit.tn.examenazizsouissi.repositories.LogistiqueRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ILogistiqueServiceImp implements ILogistiqueService {
    private final LogistiqueRep logistiqueRep;
    private final EvenementRep evenementRep;
    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt) {
        Set<Evenement> evenements = new HashSet<>();
        evenements = evenementRep.getEvenementsByDescription(descriptionEvnmt).orElseThrow(() -> new IllegalArgumentException("No evenement found with this description: " + descriptionEvnmt));
        for (Evenement evenement : evenements) {
            Set<Logistique> logistiques = new HashSet<>();
            logistiques.add(l);
            evenement.setLogistiques(logistiques);
        }
        return logistiqueRep.save(l);
    }

    @Override
    public Set<Logistique> getLogistiquesDates(LocalDate dateDeb, LocalDate dateFin) {
        return logistiqueRep.getLogistiquesDates(dateDeb, dateFin);
    }
}
