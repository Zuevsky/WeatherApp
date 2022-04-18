package com.ubercadence.weather.controller;

import com.ubercadence.weather.saver.dto.CityTempMarkDto;
import com.ubercadence.weather.service.TemperatureCadenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final TemperatureCadenceService temperatureCadenceService;

    @GetMapping("/{cityName}")
    public CityTempMarkDto getWeather(@PathVariable String cityName) {
        return temperatureCadenceService.getTemp(cityName);
    }
}
