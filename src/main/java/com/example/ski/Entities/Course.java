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
@FieldDefaults(level = AccessLevel.PRIVATE) //rend lesattributsprivate


public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    Long numCours ;
    int niveau;
    float prix;
    @Enumerated(EnumType.STRING)
    Support support;
    TypeCours typeCours;
    int creneau;
    @OneToMany(mappedBy = "course")
    @JsonIgnore
    Set<Inscription>inscriptions;
}
