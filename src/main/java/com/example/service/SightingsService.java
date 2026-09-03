package com.example.service;

import com.example.model.Sightings;
import com.example.repository.ExpeditionsRepository;
import com.example.repository.SightingsRepository;

import java.util.Collections;
import java.util.List;

public class SightingsService {

    private SightingsRepository sightingsRepository;
    private ExpeditionsRepository expeditionsRepository;

    public void setSightingsRepository(SightingsRepository sightingsRepository) {
        this.sightingsRepository = sightingsRepository;
    }

    public void setExpeditionsRepository(ExpeditionsRepository expeditionsRepository) {
        this.expeditionsRepository = expeditionsRepository;
    }

    public List<Sightings> getSightingsList(){
        return sightingsRepository.findAll();
    }
}
