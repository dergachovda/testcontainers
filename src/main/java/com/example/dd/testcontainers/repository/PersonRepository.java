package com.example.dd.testcontainers.repository;

import com.example.dd.testcontainers.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
