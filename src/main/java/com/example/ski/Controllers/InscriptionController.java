package com.example.ski.Controllers;

import com.example.ski.Entities.Inscription;
import com.example.ski.Services.IInscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inscription")
@RequiredArgsConstructor
public class InscriptionController {
    private final IInscriptionService iInscriptionService;
    @PostMapping("{idSk}")
    public Inscription addRegistrationAssignToSkieur(@PathVariable Long idSk, @RequestBody Inscription inscription){
        return iInscriptionService.addRegistrationAssignToSkieur(idSk, inscription);
    }
    @PostMapping("{numInscription}/{numCourse}")
    public Inscription assignInscriptionToCourse(@PathVariable long numInscription, @PathVariable long numCourse) {
        return iInscriptionService.assignInscriptionToCourse(numInscription, numCourse);
    }
}
