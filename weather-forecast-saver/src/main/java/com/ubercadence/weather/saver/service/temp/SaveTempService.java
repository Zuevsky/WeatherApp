package com.ubercadence.weather.saver.service.temp;

import com.ubercadence.weather.dto.CityTempMarkDto;
import com.ubercadence.weather.dto.TempDto;
import com.ubercadence.weather.saver.domain.CityTempMark;
import com.ubercadence.weather.saver.mapper.CityTempMarkMapper;
import com.ubercadence.weather.saver.repository.CityTempMarkRepository;
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
