package com.example.ski.Services;

import com.example.ski.Entities.Piste;
import com.example.ski.Repositories.PisteRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IPisteServiceImp implements IPisteService{
    private final PisteRep pisteRep;
    @Override
    public Piste addPiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public List<Piste> getAll() {
        return (List<Piste>) pisteRep.findAll();
    }

    @Override
    public Piste getPisteById(long id) {
        return pisteRep.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteById(long id) {
        pisteRep.deleteById(id);
        return !pisteRep.existsById(id);
    }
}
