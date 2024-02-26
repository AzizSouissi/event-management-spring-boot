package com.example.ski.Services;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.Skieur;
import com.example.ski.Entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur s, Abonnement a);
    Skieur updateSkieur(Skieur s);
    List<Skieur> getAll();
    Skieur getSkieurById(long id);
    Boolean deleteSkieurById(long id);
    public Skieur assignSkieurToPiste(long numSkieur, long numPiste);
    Skieur addSkieurAndAssignToCourse(Skieur skieur, long numCourse);
    List<Skieur> retrieveSkiersByAbonnementType(TypeAbonnement typeAbonnement);
}
