package com.ubercadence.weather.saver.service.cadence.savetempworker;

import com.ubercadence.weather.dto.CityTempMarkDto;
import com.ubercadence.weather.dto.TempDto;
import com.ubercadence.weather.saver.cadence.SaveTempActivities;
import com.ubercadence.weather.saver.service.temp.SaveTempService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveTempActivitiesImpl implements SaveTempActivities {

    private final SaveTempService saveTempService;

    @Override
    public CityTempMarkDto saveTempMark(TempDto tempMark) {
        return saveTempService.saveCityTempMark(tempMark);
    }
}
