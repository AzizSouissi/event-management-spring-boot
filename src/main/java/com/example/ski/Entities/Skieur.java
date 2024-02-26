package com.example.ski.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @ManyToMany
    Set<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    @JsonIgnore
    Set<Inscription> inscriptions;
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
}
