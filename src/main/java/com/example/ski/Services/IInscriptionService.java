package com.example.ski.Services;

import com.example.ski.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription i);
    Inscription updateInscription(Inscription i);
    List<Inscription> getAll();
    Inscription getInscriptionById(long id);
    Boolean deleteInscriptionById(long id);
    public Inscription addRegistrationAssignToSkieur(long idSk, Inscription inscription);
    public Inscription assignInscriptionToCourse(long numInscription, long numCourse);
}
