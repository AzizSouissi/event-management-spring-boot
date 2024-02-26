package com.example.ski.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend les attributs private

public class Piste {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste;
    String nomPiste;
    int longeur;
    int pente;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    @ManyToMany(mappedBy = "pistes")
    @JsonIgnore
    Set<Skieur> skieurs;


}
