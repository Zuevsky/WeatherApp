package com.ubercadence.weather.service;

import com.uber.cadence.workflow.Workflow;
import com.ubercadence.weather.provider.cadence.GetTempActivities;
import com.ubercadence.weather.provider.dto.TempDto;
import com.ubercadence.weather.saver.cadence.SaveTempActivities;
import com.ubercadence.weather.saver.dto.CityTempMarkDto;

public class TemperatureWorkflowImpl implements TemperatureWorkflow {

    private final GetTempActivities getTempActivities =
            Workflow.newActivityStub(GetTempActivities.class);

    private final SaveTempActivities saveTempActivities =
            Workflow.newActivityStub(SaveTempActivities.class);

    @Override
    public CityTempMarkDto getTemperature(String cityName) {
        TempDto tempInCity = getTempActivities.getTempInCity(cityName);
        return saveTempActivities.saveTempMark(tempInCity);
    }
}
