// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/repository/CarRepository.java`
package com.easyroadtrip.car.repository;

import com.easyroadtrip.car.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CarRepository extends MongoRepository<Car, String> {
    List<Car> findByMake(String make);
    List<Car> findByModel(String model); // Add this line
    List<Car> findByYear(int year); // Add this line
}