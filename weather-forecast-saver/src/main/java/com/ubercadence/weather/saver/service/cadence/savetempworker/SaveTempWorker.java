package com.ubercadence.weather.saver.service.cadence.savetempworker;

import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.saver.cadence.SaveTempActivities;
import com.ubercadence.weather.saver.service.cadence.CadenceServiceUtil;
import com.ubercadence.weather.saver.service.temp.SaveTempService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTempWorker {

    private final SaveTempService saveTempService;

    public Worker startSaveTempWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, SaveTempActivities.TASK_LIST);
        worker.registerActivitiesImplementations(new SaveTempActivitiesImpl(saveTempService));
        return worker;
    }
}
