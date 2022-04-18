package com.ubercadence.weather.provider.service.cadence.gettempworker;

import com.ubercadence.weather.provider.cadence.GetTempActivities;
import com.ubercadence.weather.provider.dto.TempDto;
import com.ubercadence.weather.provider.service.temp.GetTempService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetTempActivitiesImpl implements GetTempActivities {

    private final GetTempService getTempService;

    @Override
    public TempDto getTempInCity(String cityName) {
        return getTempService.getWeatherFromAPI(cityName);
    }
}
