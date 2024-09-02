// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/controller/CarEmissionController.java`
package com.easyroadtrip.car.controller;

import com.easyroadtrip.car.dto.CarDTO;
import com.easyroadtrip.car.dto.EmissionDTO;
import com.easyroadtrip.car.model.Car;
import com.easyroadtrip.car.model.Emission;
import com.easyroadtrip.car.service.CarServiceInterface;
import com.easyroadtrip.car.service.EmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarEmissionController {
    @Autowired
    private CarServiceInterface carService;

    @Autowired
    private EmissionServiceInterface emissionService;

    // Car Endpoints
    @GetMapping("/cars")
    public List<CarDTO> getAllCars() {
        return carService.getAllCars().stream()
                .map(this::convertToCarDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/cars/{id}")
    public CarDTO getCarById(@PathVariable String id) {
        return convertToCarDTO(carService.getCarById(id));
    }

    @PostMapping("/cars")
    public CarDTO saveCar(@RequestBody CarDTO carDTO) {
        Car car = convertToCarEntity(carDTO);
        return convertToCarDTO(carService.saveCar(car));
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    // Emission Endpoints
    @GetMapping("/emissions")
    public List<EmissionDTO> getAllEmissions() {
        return emissionService.getAllEmissions().stream()
                .map(this::convertToEmissionDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/emissions/{id}")
    public EmissionDTO getEmissionById(@PathVariable String id) {
        return convertToEmissionDTO(emissionService.getEmissionById(id));
    }

    @PostMapping("/emissions")
    public EmissionDTO saveEmission(@RequestBody EmissionDTO emissionDTO) {
        Emission emission = convertToEmissionEntity(emissionDTO);
        return convertToEmissionDTO(emissionService.saveEmission(emission));
    }

    @DeleteMapping("/emissions/{id}")
    public void deleteEmission(@PathVariable String id) {
        emissionService.deleteEmission(id);
    }

    // Conversion Methods
    private CarDTO convertToCarDTO(Car car) {
        return new CarDTO(car.getId(), car.getMake(), car.getBrand(), car.getModel(), car.getEngineEfficiency(), car.getDrive(), car.getYear());
    }

    private Car convertToCarEntity(CarDTO carDTO) {
        return new Car(carDTO.getId(), carDTO.getMake(), carDTO.getBrand(), carDTO.getModel(), carDTO.getEngineEfficiency(), carDTO.getDrive(), carDTO.getYear());
    }

    private EmissionDTO convertToEmissionDTO(Emission emission) {
        return new EmissionDTO(emission.getId(), emission.getEfid(), emission.getScore(), emission.getStandard());
    }

    private Emission convertToEmissionEntity(EmissionDTO emissionDTO) {
        return new Emission(emissionDTO.getId(), emissionDTO.getEfid(), emissionDTO.getScore(), emissionDTO.getStandard());
    }
}