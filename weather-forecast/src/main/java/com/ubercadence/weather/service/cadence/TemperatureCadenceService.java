package com.ubercadence.weather.service.cadence;

import com.uber.cadence.client.WorkflowClient;
import com.ubercadence.weather.saver.dto.CityTempMarkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemperatureCadenceService {

    private final WorkflowClient workflowClient;

    public CityTempMarkDto getTemp(String cityName) {
        var workflow = workflowClient.newWorkflowStub(TemperatureWorkflow.class);
        return workflow.getTemperature(cityName);
    }
}
