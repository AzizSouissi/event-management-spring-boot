package esprit.tn.examenazizsouissi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    LocalDate dateDebut;
    LocalDate dateFin;
    float count;
    @OneToMany
    Set<Logistique> logistiques;
    @ManyToMany(mappedBy = "evenements")
    Set<Participant> participants;

}