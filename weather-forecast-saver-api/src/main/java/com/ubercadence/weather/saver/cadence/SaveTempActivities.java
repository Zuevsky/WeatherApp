package com.ubercadence.weather.saver.cadence;

import com.uber.cadence.activity.ActivityMethod;
import com.ubercadence.weather.provider.dto.TempDto;
import com.ubercadence.weather.saver.dto.CityTempMarkDto;

public interface SaveTempActivities {

    String TASK_LIST = "saveTemp";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2, taskList = TASK_LIST)
    CityTempMarkDto saveTempMark(TempDto tempMark);
}
