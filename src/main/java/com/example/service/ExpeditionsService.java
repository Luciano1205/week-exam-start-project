package com.example.service;

import com.example.model.Expeditions;
import com.example.repository.ExpeditionsRepository;

import java.util.List;

public class ExpeditionsService {

    private ExpeditionsRepository expeditionsRepository;

    public void setExpeditionsRepository(ExpeditionsRepository expeditionsRepository){
        this.expeditionsRepository = expeditionsRepository;

    }

    public List<Expeditions> getExpeditionsList(){
        return expeditionsRepository.findAll();
    }

}
