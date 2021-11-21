package org.assoSportive.repository;

import org.assoSportive.model.Gymnase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymnaseRepository extends MongoRepository<Gymnase, String> {
    //MongoRepository hérite entre autres de la classe CrudRepository
    //<Type d'entité, type de la variable identifiant
}
