// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/model/Emission.java`
package com.easyroadtrip.car.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "emissions")
public class Emission {
    @Id
    private String id;
    private String efid;
    private int score;
    private String standard;
}