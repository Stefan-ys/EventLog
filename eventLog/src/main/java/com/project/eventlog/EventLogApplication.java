package com.project.eventlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventLogApplication.class, args);
    }

}
