package org.assoSportive.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Gymnases")//identifies a domain object to be persisted to MongoDB.
public class Gymnase {

    private ObjectId objId = new ObjectId();

    @Id//tells MongoDB to generate a unique Id for every document (demarcates an identifier).
    //@Field("_id")
    @Field("id")
    @MongoId
    private String id = String.valueOf(objId);
    @Field("IdGymnase")
    private int idGymnase;
    @Field("NomGymnase")
    private String nomGymnase;
    @Field("Adresse")
    private String adresse;
    @Field("Ville")
    private String ville;
    @Field("Surface")
    private int surface;
    @Field("Seances")
    private List<Seances> seances;

    }

