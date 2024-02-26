package esprit.tn.examenazizsouissi.controllers;

import esprit.tn.examenazizsouissi.entities.Participant;
import esprit.tn.examenazizsouissi.services.IParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("participant")
@RequiredArgsConstructor
public class ParticipantController {
    private final IParticipantService iParticipantService;
    @PostMapping
    public Participant ajouterParticipant(@RequestBody Participant p) {
        return iParticipantService.ajouterParticipant(p);
    }
    @GetMapping
    public List<Participant> getParReservLogis() {
        return iParticipantService.getParReservLogis();
    }
}
