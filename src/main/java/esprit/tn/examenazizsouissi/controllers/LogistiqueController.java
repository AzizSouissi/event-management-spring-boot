package esprit.tn.examenazizsouissi.controllers;

import esprit.tn.examenazizsouissi.entities.Logistique;
import esprit.tn.examenazizsouissi.services.ILogistiqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Set;

@RestController
@RequestMapping("logistique")
@RequiredArgsConstructor
public class LogistiqueController {
    private final ILogistiqueService iLogistiqueService;
    @PostMapping("{descriptionEvnmt}")
    public Logistique ajoutAffectLogEvnm(@RequestBody Logistique l, @PathVariable String descriptionEvnmt) {
        return iLogistiqueService.ajoutAffectLogEvnm(l, descriptionEvnmt);
    }
    @GetMapping("{dateDeb}/{dateFin}")
    public Set<Logistique> getLogistiquesDates(@PathVariable LocalDate dateDeb, @PathVariable LocalDate dateFin) {
        return iLogistiqueService.getLogistiquesDates(dateDeb, dateFin);
    }
}
