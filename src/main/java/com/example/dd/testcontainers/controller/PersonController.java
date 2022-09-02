package com.example.dd.testcontainers.controller;

import com.example.dd.testcontainers.entity.Person;
import com.example.dd.testcontainers.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("/persons")
    List<Person> all() {
        return service.findAll();
    }

}
