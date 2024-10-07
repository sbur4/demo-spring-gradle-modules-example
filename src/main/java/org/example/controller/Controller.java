package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {
    @Autowired
    CoreService coreService;

    @PostMapping("/hello")
    public String sendMainMessage(@RequestParam("message") String message) {
        log.debug("Received a request for greeting with name: {}", message);

        return "Hello " + message;
    }

    @GetMapping("/core")
    public String coreService() {
        return coreService.sendServiceMessage();
    }
}