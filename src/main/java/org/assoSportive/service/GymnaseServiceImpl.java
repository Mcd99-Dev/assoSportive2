package org.assoSportive.service;

import org.assoSportive.model.Gymnase;
import org.assoSportive.repository.GymnaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GymnaseServiceImpl implements GymnaseService {

    @Autowired
    private GymnaseRepository gymrepository;

    @Override
    public Gymnase create(Gymnase gymnase) {

        return gymrepository.insert(gymnase);
    }

    @Override
    public List<Gymnase> read() {
        return gymrepository.findAll();
    }

    @Override
    public Gymnase update(Gymnase gymnase) {
        return gymrepository.save(gymnase);
    }

    @Override
    public Map<String, String> delete(String id) {//Map<the type of keys maintained by this map, the type of mapped values

        // Total count of data before delete
        long beforeDelete = gymrepository.count();

        gymrepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = gymrepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }
}




