package com.ubercadence.weather.service.cadence;

import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import org.springframework.stereotype.Service;

@Service
public class MainWorkflowWorker {

    public Worker startMainWorkflowWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, CadenceServiceUtil.TASK_LIST);
        worker.registerWorkflowImplementationTypes(TemperatureWorkflowImpl.class);
        return worker;
    }
}
