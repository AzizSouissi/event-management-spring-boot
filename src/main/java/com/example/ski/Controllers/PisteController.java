package com.example.ski.Controllers;

import com.example.ski.Entities.Piste;
import com.example.ski.Services.IPisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteController {
    private final IPisteService iPisteService;

    @GetMapping
    public List<Piste> getAll() {
        return iPisteService.getAll();
    }

    @GetMapping("{id}")
    public Piste getPisteById(@PathVariable long id) {
        return iPisteService.getPisteById(id);
    }

    @PutMapping
    public Piste updatePiste(@RequestBody Piste p) {
        return iPisteService.updatePiste(p);
    }

    @PostMapping
    public Piste addPiste(@RequestBody Piste p) {
        return iPisteService.addPiste(p);
    }
    @DeleteMapping("{id}")
    public Boolean deleteById(@PathVariable long id) {
        return iPisteService.deleteById(id);
    }
}