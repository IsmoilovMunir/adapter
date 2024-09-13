package com.example.adapter.cantroller;

import com.example.adapter.model.MessageA;
import com.example.adapter.model.MessageB;
import com.example.adapter.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/adapter")
public class AdapterController {
    private final RestTemplate restTemplate;
    private final WeatherService weatherService;

    public AdapterController(RestTemplate restTemplate, WeatherService weatherService) {
        this.restTemplate = restTemplate;
        this.weatherService = weatherService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processMassageA(@RequestBody MessageA messageA) {
        if (messageA.getMessage() == null || messageA.getMessage().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Пустое сообщение");
        }

        if (!"ru".equals(messageA.getLng())) {
            return ResponseEntity.status(403).body("Неподдерживаемый язык");
        }

        // Получаем температуру от service
        int currentTemp = weatherService.getCurrentTemperature(messageA.getCoordinates().getLatitude(), messageA.getCoordinates().getLongitude());

        // Преобразуем MessageA в MessageB

        MessageB messageB = new MessageB();
        messageB.setText(messageA.getMessage());
        messageB.setCreatedDate(LocalDateTime.now());
        messageB.setCurrentTemp(currentTemp);

        //Пересылаем сообщение в ServiceB;

        String serviceBUrl = "http://SERVICE-B/serviceB/receive"; // URL-адрес Service B через Eureka
        ResponseEntity<String> response = restTemplate.postForEntity(serviceBUrl, messageB, String.class);
        return ResponseEntity.ok("Обработано и отправлено в Service B" + response.getBody());


    }
}
