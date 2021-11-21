package org.assoSportive.controller;

import org.assoSportive.model.Sportif;
import org.assoSportive.service.SportifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController//=le controller est un controller Rest et  les méthodes de ce controller public vont remonter des données sous forme de Json
@RequestMapping("/sportif")//Toutes les méthodes annotées ci-dessous seront accessibles sur localhost:8080/sportif. Ex : fin
public class SportifController {

        @Autowired//on injecte un service.
        private SportifService sportifService;//à l'instanciation du controller, on va également instancier une implémentation de GymserviceService

        @GetMapping
        public List<Sportif> getAllSportifs() {
            return sportifService.read();//Dans cette méthode, on appelle gymService.read()
        }

        @PostMapping
        public Sportif saveSportif(@RequestBody Sportif sportif) {
            return sportifService.create(sportif);

        }

        @PutMapping
        public Sportif updateSportif(@RequestBody Sportif sportif) {

            return sportifService.update(sportif);
        }

        @DeleteMapping("/{id}")
        public Map<String, String> deleteGym(@PathVariable String id) {
            return sportifService.delete(id);
        }
    }


