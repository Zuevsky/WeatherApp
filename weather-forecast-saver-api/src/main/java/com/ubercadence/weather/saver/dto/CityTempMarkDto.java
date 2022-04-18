package com.ubercadence.weather.saver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityTempMarkDto {

    private String cityName;

    private Double temperature;

    private LocalDateTime requestTime;
}
