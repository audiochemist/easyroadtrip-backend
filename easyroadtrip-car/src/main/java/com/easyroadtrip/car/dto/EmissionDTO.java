// File: `easyroadtrip-car/src/main/java/com/easyroadtrip/car/dto/EmissionDTO.java`
package com.easyroadtrip.car.dto;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmissionDTO {
    private String id;
    private String efid;
    private int score;
    private String standard;
}