package com.example.ski.Services;

import com.example.ski.Entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste p);
    Piste updatePiste(Piste p);
    List<Piste> getAll();
    Piste getPisteById(long id);
    Boolean deleteById(long id);
}
