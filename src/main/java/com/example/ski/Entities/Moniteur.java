package com.example.ski.Entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur;
    String nomM;
    String prenomM;
    LocalDate dateRecru;
    @OneToMany
    Set<Course>courses;
}
