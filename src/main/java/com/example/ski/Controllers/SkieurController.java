package com.example.ski.Controllers;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.Skieur;
import com.example.ski.Entities.TypeAbonnement;
import com.example.ski.Services.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {
    private final ISkieurService iSkieurService;
    @GetMapping
    public List<Skieur> getAll() {
        return  iSkieurService.getAll();
    }
    @GetMapping("{id}")
    public Skieur getSkieurById(@PathVariable long id) {
        return iSkieurService.getSkieurById(id);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur s) {
        return iSkieurService.updateSkieur(s);
    }
    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur s, Abonnement a) {
        return iSkieurService.addSkieur(s, a);
    }
    @DeleteMapping("{id}")
    public Boolean deleteSkieurById(@PathVariable long id) { return iSkieurService.deleteSkieurById(id); }
    @PostMapping("{numSkieur}/{numPiste}")
    public Skieur assignSkieurToPiste(@PathVariable long numSkieur, @PathVariable long numPiste) {
        return iSkieurService.assignSkieurToPiste(numSkieur, numPiste);
    }
    @PostMapping("{numCourse}")
    public Skieur addSkieurAndAssignToCourse(@RequestBody Skieur skieur, @PathVariable long numCourse) {
        return iSkieurService.addSkieurAndAssignToCourse(skieur, numCourse);
    }
}
