package com.ubercadence.weather.provider.service.cadence;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.client.WorkflowClientOptions;
import com.uber.cadence.serviceclient.ClientOptions;
import com.uber.cadence.serviceclient.WorkflowServiceTChannel;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;

public class CadenceServiceUtil {

    public static final String DOMAIN = "samples-domain";

    public static WorkflowClient getWorkflowClient() {
        return WorkflowClient.newInstance(
                new WorkflowServiceTChannel(ClientOptions.defaultInstance()),
                WorkflowClientOptions.newBuilder().setDomain(DOMAIN).build());
    }

    public static WorkerFactory getWorkerFactory(WorkflowClient workflowClient) {
        return WorkerFactory.newInstance(workflowClient);
    }

    public static Worker getWorker(WorkerFactory workerFactory, String taskList) {
        return workerFactory.newWorker(taskList);
    }
}
