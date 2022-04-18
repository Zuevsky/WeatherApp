package com.ubercadence.weather.service.temperature;

import com.ubercadence.weather.domain.CityTempMark;
import com.ubercadence.weather.dto.CityTempMarkDto;
import com.ubercadence.weather.mapper.CityTempMarkMapper;
import com.ubercadence.weather.provider.dto.TempDto;
import com.ubercadence.weather.repository.CityTempMarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTempService {

    private final CityTempMarkRepository repository;

    private final CityTempMarkMapper mapper;

    public CityTempMarkDto saveCityTempMark(TempDto tempDto) {
        CityTempMark tempMark = repository.save(mapper.mapTempDtoInCityTempMark(tempDto));
        return mapper.mapCityTempMarkInCityTempMarkDto(tempMark);
    }
}
