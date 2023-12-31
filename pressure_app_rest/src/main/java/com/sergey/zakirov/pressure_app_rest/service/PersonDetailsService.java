package com.sergey.zakirov.pressure_app_rest.service;

import com.sergey.zakirov.pressure_app_rest.model.Person;
import com.sergey.zakirov.pressure_app_rest.repository.PersonRepository;
import com.sergey.zakirov.pressure_app_rest.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonDetailsService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = personRepository.findByUsername(username);

        if (person.isEmpty()) {
            throw new UsernameNotFoundException("NO! User not found");
        }
            return new PersonDetails(person.get());
    }
}
