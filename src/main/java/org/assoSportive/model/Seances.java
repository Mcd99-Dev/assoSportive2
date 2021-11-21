package org.assoSportive.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seances {

    @Field("IdSportifEntraineur")
    private int idSportifEntraineur;
    @Field("Jour")
    private String jour;
    @Field("Horaire")
    private int horaire;
    @Field("Duree")
    private int duree;
    @Field("Libelle")
    private String libelle;

}
