package com.example.serviceB.controller;

import com.example.serviceB.model.MessageB;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("serviceB")
public class ServiceBController {

    @PostMapping("/receive")
    public ResponseEntity<String> receiveMessage(@RequestBody MessageB messageB){
        System.out.println("Получено MessageB: "+ messageB);
        return ResponseEntity.ok("Сообщение получено и обработано  Service B");
    }
}
