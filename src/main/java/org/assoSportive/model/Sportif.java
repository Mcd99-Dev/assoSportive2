package org.assoSportive.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

 @Builder
 @AllArgsConstructor
 @NoArgsConstructor
 @Getter
 @Setter
 @Document(collection = "Sportifs")//identifies a domain object to be persisted to MongoDB.
 public class Sportif {

        private ObjectId objId = new ObjectId();

        @Id//tells MongoDB to generate a unique Id for every document (demarcates an identifier).
        @Field("id")
        private String id=String.valueOf(objId);
        @Field("IdSportif")
        private int idSportif;
        @Field("Nom")
        private String nom;
        @Field("Prenom")
        private String prenom;
        @Field("Sexe")
        private String sexe;
        @Field("Age")
        private int age;
        @Field("IdSportifConseiller")
        private int idSportifConseiller;
        @Field("Sports")
        private Sports sports;

    }



