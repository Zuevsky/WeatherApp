package com.ubercadence.weather.service;


import com.ubercadence.weather.dto.CityTempMarkDto;

public interface TemperatureCadenceService {

    CityTempMarkDto getTemp(String cityName);
}
