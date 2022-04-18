package com.ubercadence.weather.service;

import com.uber.cadence.client.WorkflowClient;
import com.ubercadence.weather.dto.CityTempMarkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemperatureCadenceServiceImpl implements TemperatureCadenceService {

    private final WorkflowClient workflowClient;

    public CityTempMarkDto getTemp(String cityName) {
        TemperatureWorkflow workflow = workflowClient.newWorkflowStub(TemperatureWorkflow.class);
        return workflow.getTemperature(cityName);
    }
}
