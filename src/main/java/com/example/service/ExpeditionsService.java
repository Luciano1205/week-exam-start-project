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


    public String save(Integer id, String name, String code, String region, String baseCamp, String leader, String startDate, String endDate, String estate) {
        expeditionsRepository.save(new Expeditions(id, name, code, region, baseCamp, leader, startDate, endDate, estate));
        return "OK";
    }
}
