package org.assoSportive.service;

import org.assoSportive.model.Gymnase;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public interface GymnaseService {
    //On déclare ici toutes les méthodes du CRUD

    Gymnase create (Gymnase gymnase);
    List<Gymnase> read();
    Gymnase update(Gymnase gymnase);
    Map<String, String> delete(String id);

}

