package com.example.repository;

import com.example.model.Expeditions;
import com.example.model.Sightings;

import java.util.ArrayList;
import java.util.List;

public class SightingsRepository {

    private List<Sightings> sightingsList = new ArrayList<>();

    public SightingsRepository(){

        save(new Sightings(id, sightingCode, name, description, scientificName, sightedAt, location, quantity, confidenceLevel, expeditionId))

    }

}
