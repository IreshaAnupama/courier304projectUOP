package com.example.courier304project.dto.send;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserParcelListDto {
    private Long id;
    float parcelCost;
    float deliveryCost;
}
