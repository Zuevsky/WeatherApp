package com.ubercadence.weather.config;

import com.uber.cadence.client.WorkflowClient;
import com.ubercadence.weather.service.TemperatureCadenceService;
import com.ubercadence.weather.service.TemperatureCadenceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherForecastConfig {

    @Bean
    public TemperatureCadenceService temperatureCadenceService(WorkflowClient workflowClient) {
        return new TemperatureCadenceServiceImpl(workflowClient);
    }
}
