package com.example.ski.Services;

import com.example.ski.Entities.*;
import com.example.ski.Repositories.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService {
    private final SkieurRep skieurRep;
    private final PisteRep pisteRep;
    private final CourseRep courseRep;
    private final AbonnementRep abonnementRep;
    private final InscriptionRep inscriptionRep;


    @Override
    public Skieur addSkieur(Skieur s, Abonnement a) {
        abonnementRep.save(a);
        s.setAbonnement(a);
        return skieurRep.save(s);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRep.save(s);
    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRep.findAll();
    }

    @Override
    public Skieur getSkieurById(long id) {
        return skieurRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No skieur found by this id" + id));
    }

    @Override
    public Boolean deleteSkieurById(long id) {
        skieurRep.deleteById(id);
        return !skieurRep.existsById(id);
    }

    @Override
    @Transactional
    public Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        Skieur skieur = skieurRep.findById(numSkieur).orElse(null);
        Piste piste = pisteRep.findById(numPiste).orElse(null);
        Set<Piste> pistes = skieur.getPistes();
        if(pistes == null){
            pistes = new HashSet<>();
        }
        pistes.add(piste);
        skieur.setPistes(pistes);
        return skieur;
    }

    @Override
    public Skieur addSkieurAndAssignToCourse(Skieur skieur, long numCourse) {
        Course course = courseRep.findById(numCourse).orElse(null);
        Inscription inscription = skieur.getInscriptions().stream().findFirst().get();
        inscription.setSkieur(skieur);
        inscription.setCourse(course);
        skieurRep.save(skieur);
        inscriptionRep.save(inscription);
        return skieurRep.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkiersByAbonnementType(TypeAbonnement typeAbonnement) {
        return null;
    }
}
