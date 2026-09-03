package com.example.repository;

import com.example.model.Expeditions;
import com.example.model.Sightings;

import java.util.ArrayList;
import java.util.List;

public class SightingsRepository {

    private List<Sightings> sightingsList = new ArrayList<>();

    public SightingsRepository(){

        save(new Sightings(null, "12345", "Cocodrilo", "Muy bonito", "Reptil", "4/9/2026 2:30am", "Rio Amazonas", 1, 3, 1));
        save(new Sightings(null, "12345678", "Condor", "Imponente", "vertebrado con plumas y alas", "7/9/2026 12:30pm", "Sierra Nevada", 1, 2, 2));

    }

    public List<Sightings> findAll(){
        return sightingsList;
    }

    public List<Sightings> findByExpeditionsId(Integer expeditionId) {
        List<Sightings> result = new ArrayList<>();
        for (Sightings sightings : sightingsList) {
            if (sightings.getExpeditionId().equals(expeditionId)) {
                result.add(sightings);
            }
        }
        return result;
    }

    public void save(Sightings sightings){
        sightingsList.add(sightings);
    }

}
