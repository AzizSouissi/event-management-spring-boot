package com.example.ski.Repositories;

import com.example.ski.Entities.Inscription;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface InscriptionRep extends CrudRepository<Inscription, Long> {
}
