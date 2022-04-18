package com.ubercadence.weather.saver.mapper;

import com.ubercadence.weather.dto.CityTempMarkDto;
import com.ubercadence.weather.dto.TempDto;
import com.ubercadence.weather.saver.domain.CityTempMark;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Component
public class CityTempMarkMapper {

    public CityTempMark mapCityTempMarkDtoInCityTempMark(CityTempMarkDto cityTempMark) {
        return CityTempMark.builder()
                .cityName(cityTempMark.getCityName())
                .temperature(cityTempMark.getTemperature())
                .requestTime(cityTempMark.getRequestTime())
                .build();
    }

    public CityTempMarkDto mapCityTempMarkInCityTempMarkDto(CityTempMark cityTempMark) {
        return CityTempMarkDto.builder()
                .cityName(cityTempMark.getCityName())
                .temperature(cityTempMark.getTemperature())
                .requestTime(cityTempMark.getRequestTime())
                .build();
    }

    public CityTempMark mapTempDtoInCityTempMark(TempDto tempDto) {
        return CityTempMark.builder()
                .cityName(tempDto.getName())
                .temperature(tempDto.getMain().get("temp"))
                .requestTime(LocalDateTime.from(ZonedDateTime.now()))
                .build();
    }
}
