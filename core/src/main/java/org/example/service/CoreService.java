package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Slf4j
@Service
public class CoreService {

    public String sendServiceMessage() {
        String id = UUID.randomUUID().toString();
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm"));
        String answer = String.format("%s.%s", currentTime, id);
        log.debug("Answer: {}", answer);

        return answer;
    }
}