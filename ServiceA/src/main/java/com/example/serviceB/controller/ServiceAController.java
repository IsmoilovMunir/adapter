package com.example.serviceB.controller;

import com.example.serviceB.model.MessageA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/serviceA")
public class ServiceAController {
    private final RestTemplate restTemplate;

    public ServiceAController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody MessageA messageA){
        String url = "http://ADAPTER-SERVICE/adapter/process";
        ResponseEntity<String> response = restTemplate.postForEntity(url, messageA, String.class);
        return ResponseEntity.ok(response.getBody());

    }
}
