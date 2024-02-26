package com.example.ski.Controllers;

import com.example.ski.Entities.Moniteur;
import com.example.ski.Services.IMoniteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")
@RequiredArgsConstructor
public class MoniteurController {
    private final IMoniteurService iMoniteurService;

    @GetMapping
    public List<Moniteur> getAll() {
        return iMoniteurService.getAll();
    }

    @GetMapping("{id}")
    public Moniteur getMoniteurById(@PathVariable long id) {
        return iMoniteurService.getMoniteurById(id);
    }

    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        return iMoniteurService.updateMoniteur(m);
    }

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        return iMoniteurService.addMoniteur(m);
    }
    @DeleteMapping("{id}")
    public Boolean deleteMoniteurById(@PathVariable long id) {
        return iMoniteurService.deleteMoniteurById(id);
    }
    @PostMapping("{numCourse}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable long numCourse) {
        return iMoniteurService.addInstructorAndAssignToCourse(moniteur, numCourse);
    }
}