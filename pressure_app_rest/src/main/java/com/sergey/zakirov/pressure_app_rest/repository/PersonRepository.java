package com.sergey.zakirov.pressure_app_rest.repository;

import com.sergey.zakirov.pressure_app_rest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByUsername(String username);
}
