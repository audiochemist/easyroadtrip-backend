// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/model/Car.java`
package com.easyroadtrip.car.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "cars")
public class Car {
    @Id
    private String id;
    private String make; // Add this line if missing
    private String brand;
    private String model;
    private double engineEfficiency;
    private String drive;
    private int year;
}