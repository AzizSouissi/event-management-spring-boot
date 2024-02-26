package com.example.ski.Repositories;

import com.example.ski.Entities.Piste;
import com.example.ski.Entities.Support;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PisteRep extends CrudRepository<Piste, Long> {
}