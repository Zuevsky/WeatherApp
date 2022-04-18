package com.ubercadence.weather.service.cadence.savetempworker;

import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.service.cadence.CadenceServiceUtil;
import com.ubercadence.weather.service.cadence.TemperatureWorkflowImpl;
import com.ubercadence.weather.service.temperature.SaveTempService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTempWorker {

//    private static final String TASK_LIST = "getTemperature";

    private final SaveTempService saveTempService;

    public Worker startSaveTempWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, SaveTempActivities.TASK_LIST);
        worker.registerWorkflowImplementationTypes(TemperatureWorkflowImpl.class);
        worker.registerActivitiesImplementations(new SaveTempActivitiesImpl(saveTempService));
        return worker;
    }
}
