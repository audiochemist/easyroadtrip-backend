// File: easyroadtrip-car/src/main/java/com/easyroadtrip/car/service/EmissionServiceInterface.java
package com.easyroadtrip.car.service;

import com.easyroadtrip.car.model.Emission;
import java.util.List;

public interface EmissionServiceInterface {
    List<Emission> getAllEmissions();
    Emission getEmissionById(String id);
    Emission saveEmission(Emission emission);
    void deleteEmission(String id);
    List<Emission> findByStandard(String standard);
    List<Emission> findByScore(int score);
}