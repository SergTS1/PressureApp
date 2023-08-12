package com.sergey.zakirov.pressure_app_rest.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Person")
public class Person {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String username;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column
    private String password;

}
