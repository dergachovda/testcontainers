package com.example.dd.testcontainers.service;

import com.example.dd.testcontainers.entity.Person;
import com.example.dd.testcontainers.repository.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    private PersonService testObj;
    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        testObj = new PersonService(personRepository);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAllTest() {
        var expected = Collections.singletonList(new Person());
        when(personRepository.findAll()).thenReturn(expected);

        var result = testObj.findAll();

        assertEquals(expected, result);
    }

}
