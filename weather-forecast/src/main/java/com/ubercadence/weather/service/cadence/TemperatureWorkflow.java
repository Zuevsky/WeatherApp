package com.ubercadence.weather.service.cadence;

import com.uber.cadence.workflow.WorkflowMethod;
import com.ubercadence.weather.dto.CityTempMarkDto;

public interface TemperatureWorkflow {

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 10, taskList = CadenceServiceUtil.TASK_LIST)
    CityTempMarkDto getTemperature(String cityName);
}
