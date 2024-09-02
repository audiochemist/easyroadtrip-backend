// File: easyroadtrip-car/src/main/java/com/easyroadtrip/car/service/CarServiceInterface.java
package com.easyroadtrip.car.service;

import com.easyroadtrip.car.model.Car;
import java.util.List;

public interface CarServiceInterface {
    List<Car> getAllCars();
    Car getCarById(String id);
    Car saveCar(Car car);
    void deleteCar(String id);
    List<Car> findByMake(String make);
    List<Car> findByModel(String model);
    List<Car> findByYear(int year);
}