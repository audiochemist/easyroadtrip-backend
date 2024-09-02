// File: easyroadtrip-car/src/main/java/com/easyroadtrip/car/service/CarService.java
package com.easyroadtrip.car.service;

import com.easyroadtrip.car.model.Car;
import com.easyroadtrip.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarServiceInterface {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(String id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> findByMake(String make) {
        return carRepository.findByMake(make);
    }

    @Override
    public List<Car> findByModel(String model) {
        return carRepository.findByModel(model);
    }

    @Override
    public List<Car> findByYear(int year) {
        return carRepository.findByYear(year);
    }
}