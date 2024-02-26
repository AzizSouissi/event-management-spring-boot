package esprit.tn.examenazizsouissi.services;

import esprit.tn.examenazizsouissi.entities.Evenement;
import esprit.tn.examenazizsouissi.repositories.EvenementRep;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEvenementServiceImp implements IEvenementService {
    private final EvenementRep evenementRep;
    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        return null;
    }

    @Override
    @Scheduled(fixedRate = 60000)
    public void calculCout() {
    }

}
