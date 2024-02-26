package com.example.ski.Controllers;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.TypeAbonnement;
import com.example.ski.Services.IAbonnementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class AbonnementController {
    private final IAbonnementService iAbonnementService;

    @GetMapping
    public List<Abonnement> getAll() {
        return iAbonnementService.getAll();
    }

    @GetMapping("{id}")
    public Abonnement getAbonnementById(@PathVariable long id) {
        return iAbonnementService.getAbonnementById(id);
    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement a) {
        return iAbonnementService.updateAbonnement(a);
    }

    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement a) {
        return iAbonnementService.addAbonnement(a);
    }

    @DeleteMapping("{id}")
    public Boolean deleteAbonnementById(@PathVariable long id) {
        return iAbonnementService.deleteAbonnementById(id);
    }
}