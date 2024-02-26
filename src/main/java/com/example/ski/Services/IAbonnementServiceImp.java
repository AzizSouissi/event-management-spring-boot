package com.example.ski.Services;

import com.example.ski.Entities.Abonnement;
import com.example.ski.Entities.TypeAbonnement;
import com.example.ski.Repositories.AbonnementRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IAbonnementServiceImp implements IAbonnementService {
    private final AbonnementRep abonnementRep;

    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRep.save(a);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return abonnementRep.save(a);
    }

    @Override
    public Abonnement getAbonnementById(long id) {
        return abonnementRep.findById(id).orElse(null);
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>) abonnementRep.findAll();
    }

    @Override
    public Boolean deleteAbonnementById(long id) {
        abonnementRep.deleteById(id);
        return !abonnementRep.existsById(id);
    }
}
