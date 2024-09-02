// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/dto/CarDTO.java`
package com.easyroadtrip.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private String id;
    private String make; // Add this line if missing
    private String brand;
    private String model;
    private double engineEfficiency;
    private String drive;
    private int year;
}