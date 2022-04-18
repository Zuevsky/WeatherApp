package com.ubercadence.weather.configure;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.service.cadence.CadenceServiceUtil;
import com.ubercadence.weather.service.cadence.MainWorkflowWorker;
import com.ubercadence.weather.service.cadence.savetempworker.SaveTempWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(
            MainWorkflowWorker workflowWorker,
            SaveTempWorker saveTempWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        workflowWorker.startMainWorkflowWorker(factory);
        saveTempWorker.startSaveTempWorker(factory);
        factory.start();

        return workflowClient;
    }
}
