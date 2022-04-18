package com.ubercadence.weather.provider.configure;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import com.ubercadence.weather.provider.service.cadence.CadenceServiceUtil;
import com.ubercadence.weather.provider.service.cadence.gettempworker.GetTempWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(GetTempWorker getTempWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        getTempWorker.startGetTempWorker(factory);
        factory.start();

        return workflowClient;
    }
}
