package com.example.demo.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public Event execute(Event event) {
        return event;
    }

    @Data
    class Event {
        String name;
        String val;
    }

}
