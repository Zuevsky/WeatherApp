package com.ubercadence.weather.service.cadence.savetempworker;

import com.ubercadence.weather.dto.CityTempMarkDto;
import com.ubercadence.weather.provider.dto.TempDto;
import com.ubercadence.weather.service.temperature.SaveTempService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveTempActivitiesImpl implements SaveTempActivities {

    private final SaveTempService saveTempService;

    @Override
    public CityTempMarkDto saveTempMark(TempDto tempMark) {
        return saveTempService.saveCityTempMark(tempMark);
    }
}
