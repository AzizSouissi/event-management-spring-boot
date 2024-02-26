package com.example.ski.Services;

import com.example.ski.Entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur m);
    Moniteur updateMoniteur(Moniteur m);
    List<Moniteur> getAll();
    Moniteur getMoniteurById(long id);
    Boolean deleteMoniteurById(long id);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, long numCourse);

}
