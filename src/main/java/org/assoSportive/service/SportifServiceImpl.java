package org.assoSportive.service;

import org.assoSportive.model.Sportif;
import org.assoSportive.repository.SportifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SportifServiceImpl implements SportifService{

    @Autowired
    private SportifRepository sportifRepository;

    @Override
    public Sportif create(Sportif sportif) {
        return sportifRepository.insert(sportif);
    }

    @Override
    public List<Sportif> read() {
        return sportifRepository.findAll();
    }

    @Override
    public Sportif update(Sportif sportif) {
        return sportifRepository.save(sportif);
    }

    @Override
    public Map<String, String> delete(String id) {//Map<the type of keys maintained by this map, the type of mapped values

            //Total count of data before delete
            long beforeDelete = sportifRepository.count();
            sportifRepository.deleteById(id);
           sportifRepository.deleteById(id);

            //Total count of data after delete
            long afterDelete = sportifRepository.count();

           String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

            Map<String, String> deleteMap = new HashMap<>();
            deleteMap.put("message", messageValue);

            return deleteMap;
    }
}
