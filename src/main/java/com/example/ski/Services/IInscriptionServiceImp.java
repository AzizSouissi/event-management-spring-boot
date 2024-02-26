package com.example.ski.Services;

import com.example.ski.Entities.Course;
import com.example.ski.Entities.Inscription;
import com.example.ski.Entities.Skieur;
import com.example.ski.Repositories.CourseRep;
import com.example.ski.Repositories.InscriptionRep;
import com.example.ski.Repositories.SkieurRep;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService {
    private final InscriptionRep inscriptionRep;
    private final SkieurRep skieurRep;
    private final CourseRep courseRep;
    @Override
    public Inscription addInscription(Inscription i) {
        return inscriptionRep.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return inscriptionRep.save(i);
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) inscriptionRep.findAll();
    }

    @Override
    public Inscription getInscriptionById(long id) {
        return inscriptionRep.findById(id).orElseThrow(()-> new IllegalArgumentException("No Inscription found by this id"));
    }

    @Override
    public Boolean deleteInscriptionById(long id) {
        inscriptionRep.deleteById(id);
        return !inscriptionRep.existsById(id);
    }

    @Override
    public Inscription addRegistrationAssignToSkieur(long idSk, Inscription inscription) {
        Skieur skieur = skieurRep.findById(idSk).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRep.save(inscription);
    }

    @Override
    @Transactional
    public Inscription assignInscriptionToCourse(long numInscription, long numCourse) {
        Inscription inscription = inscriptionRep.findById(numInscription).orElse(null);
        Course course = courseRep.findById(numCourse).orElse(null);
        inscription.setCourse(course);
        return inscription;
    }
}
