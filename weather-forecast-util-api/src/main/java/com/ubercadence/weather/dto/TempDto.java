package com.ubercadence.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TempDto {

    @JsonProperty("main")
    private Map<String, Double> main;

    @JsonProperty("name")
    private String name;
}
