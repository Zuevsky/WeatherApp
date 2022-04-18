package com.ubercadence.weather.provider.cadence;

import com.uber.cadence.activity.ActivityMethod;
import com.ubercadence.weather.provider.dto.TempDto;

public interface GetTempActivities {

    String TASK_LIST = "getTemp";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2, taskList = TASK_LIST)
    TempDto getTempInCity(String cityName);
}
