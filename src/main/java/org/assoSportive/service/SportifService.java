package org.assoSportive.service;

import org.assoSportive.model.Sportif;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service
public interface SportifService {
    Sportif create (Sportif sportif);
    List<Sportif> read();
    Sportif update(Sportif sportif);
    Map<String, String> delete(String id);
}
