package com.example.ski.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInscription;
    int numSemaine;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Course course;


}
