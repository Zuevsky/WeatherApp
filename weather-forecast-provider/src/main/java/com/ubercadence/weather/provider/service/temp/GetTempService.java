package com.ubercadence.weather.provider.service.temp;

import com.ubercadence.weather.dto.TempDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class GetTempService {

    private final String URI = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s%s";

    private final String API_ID = "ed245080b9d04d618ae9620884286324";

    private final String METRIC = "&units=metric";

    public TempDto getWeatherFromAPI(String cityName) {
        RestTemplate template = new RestTemplate();
        return template.getForObject(getUrl(cityName), TempDto.class);
    }

    private String getUrl(String cityName) {
        return String.format(URI, cityName, API_ID, METRIC);
    }
}
