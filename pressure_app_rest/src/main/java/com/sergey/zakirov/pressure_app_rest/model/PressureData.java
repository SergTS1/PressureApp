package com.sergey.zakirov.pressure_app_rest.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="pressure")
public class PressureData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "local_date")
    private LocalDateTime localDateTime = LocalDateTime.now();

    @Column(name = "morning_pressure")
    private String morningPressure;

    @Column(name = "evening_pressure")
    private String eveningPressure;

    @Column(name="comment_user")
    private String comment;

    @Column(name="users_pulse")
    private Long pulse;

    public PressureData(String morningPressure, String eveningPressure, String comment, Long pulse) {
        this.morningPressure = morningPressure;
        this.eveningPressure = eveningPressure;
        this.comment = comment;
        this.pulse = pulse;
    }
}
