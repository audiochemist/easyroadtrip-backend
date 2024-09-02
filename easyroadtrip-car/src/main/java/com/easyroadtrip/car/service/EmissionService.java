// File: easyroadtrip-car/src/main/java/com/easyroadtrip/car/service/EmissionService.java
package com.easyroadtrip.car.service;

import com.easyroadtrip.car.model.Emission;
import com.easyroadtrip.car.repository.EmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmissionService implements EmissionServiceInterface {
    @Autowired
    private EmissionRepository emissionRepository;

    @Override
    public List<Emission> getAllEmissions() {
        return emissionRepository.findAll();
    }

    @Override
    public Emission getEmissionById(String id) {
        return emissionRepository.findById(id).orElse(null);
    }

    @Override
    public Emission saveEmission(Emission emission) {
        return emissionRepository.save(emission);
    }

    @Override
    public void deleteEmission(String id) {
        emissionRepository.deleteById(id);
    }

    @Override
    public List<Emission> findByStandard(String standard) {
        return emissionRepository.findByStandard(standard);
    }

    @Override
    public List<Emission> findByScore(int score) {
        return emissionRepository.findByScore(score);
    }
}