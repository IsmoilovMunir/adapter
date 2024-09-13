package com.example.adapter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public int getCurrentTemperature(String latitude, String longitude){
        String url="https://api.gismeteo.ru/v2/weather/current?lat=" + latitude + "&lon="+ longitude;
        RestTemplate  restTemplate = new RestTemplate();
        // Фиктивная реализация
        return 25; // Предположим, что температура фиксирована для демонстрационных целей
    }
}
