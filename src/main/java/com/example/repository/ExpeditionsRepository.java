package com.example.repository;

import com.example.model.Expeditions;

import java.util.ArrayList;
import java.util.List;

public class ExpeditionsRepository {

    private List<Expeditions> expeditionsList = new ArrayList<>();

    public ExpeditionsRepository(){

        save(new Expeditions( 1, "Selva Amazonica", "A00405149" , "Amazonía", "Rio Amazonas", "Luciano", "3/9/2026", "4/9/2026", "Active"));
        save(new Expeditions( 1, "Sierra Nevada", "A00405140" , "Sierra", "Meseta de la Sierra", "Karen", "7/9/2026", "9/9/2026", "Active"));


    }

    public List<Expeditions> findAll(){
        return expeditionsList;
    }

    public Expeditions findById(Integer id) {
        for (Expeditions expeditions : expeditionsList) {
            if (expeditions.getId().equals(id)) {
                return expeditions;
            }
        }
        return null;
    }

    public void save(Expeditions expeditions){
        expeditionsList.add(expeditions);
    }

}
