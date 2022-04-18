package com.ubercadence.weather.provider.service.cadence.gettempworker;

import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.provider.cadence.GetTempActivities;
import com.ubercadence.weather.provider.service.cadence.CadenceServiceUtil;
import com.ubercadence.weather.provider.service.temp.GetTempService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetTempWorker {

    private final GetTempService getTempService;

    public Worker startGetTempWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, GetTempActivities.TASK_LIST);
        worker.registerActivitiesImplementations(new GetTempActivitiesImpl(getTempService));
        return worker;
    }
}
