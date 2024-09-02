// File: easyroadtrip-car/src/main/java/com/easyroadtrip/car/repository/EmissionRepository.java
package com.easyroadtrip.car.repository;

import com.easyroadtrip.car.model.Emission;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmissionRepository extends MongoRepository<Emission, String> {
    List<Emission> findByStandard(String standard);
    List<Emission> findByScore(int score);
}