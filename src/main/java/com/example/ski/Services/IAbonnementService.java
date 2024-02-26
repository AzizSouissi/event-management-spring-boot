package com.example.ski.Services;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement a);
    Abonnement updateAbonnement(Abonnement a);
    Abonnement getAbonnementById(long id);
    List<Abonnement> getAll();
    Boolean deleteAbonnementById(long id);
}
