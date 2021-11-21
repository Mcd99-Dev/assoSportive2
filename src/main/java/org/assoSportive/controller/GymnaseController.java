package org.assoSportive.controller;

import org.assoSportive.model.Gymnase;
import org.assoSportive.service.GymnaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController//Le controller est un controller Rest et les méthodes de ce controller public vont remonter des données sous forme de Json
@RequestMapping ("/gymnase")//Toutes les méthodes annotées ci-dessous seront accessibles sur localhost:8080/gymnase. Ex : findAll
public class GymnaseController {

    @Autowired//on injecte un service.
    private GymnaseService gymService;//à l'instanciation du controller, on va également instancier une implémentation de GymserviceService

    @GetMapping
    public List<Gymnase> getAllGyms() {

        return gymService.read();//Dans cette méthode, on appelle gymService.read()
    }

    @PostMapping
    public Gymnase saveGymnase(@RequestBody Gymnase gymnase) {
        return gymService.create(gymnase);

    }

    @PutMapping
    public Gymnase updateGymnase(@RequestBody Gymnase gymnase) {

        return gymService.update(gymnase);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteGym(@PathVariable String id) {
        return gymService.delete(id);
    }
}
