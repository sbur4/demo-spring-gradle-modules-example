package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class CoreController {

    @GetMapping("/id/{message}")
    public ResponseEntity<String> sendCoreMessage(@PathVariable("message") String message) {
        String id = UUID.randomUUID().toString();
        String answer = String.format("%s.%s", message, id);
        log.debug("Received a request for greeting with message: {}", message);

        return ResponseEntity.ok(answer);
    }
}