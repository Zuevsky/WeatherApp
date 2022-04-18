package com.ubercadence.weather.configure;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.service.CadenceServiceUtil;
import com.ubercadence.weather.service.MainWorkflowWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(
            MainWorkflowWorker workflowWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        workflowWorker.startMainWorkflowWorker(factory);
        factory.start();

        return workflowClient;
    }
}
