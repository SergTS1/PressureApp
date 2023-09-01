package com.sergey.zakirov.pressure_app_rest.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="pressure")
public class PressureDate {

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

    public PressureDate() {
    }

    public PressureDate(String morningPressure, String eveningPressure, String comment, Long pulse) {
        this.morningPressure = morningPressure;
        this.eveningPressure = eveningPressure;
        this.comment = comment;
        this.pulse = pulse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getMorningPressure() {
        return morningPressure;
    }

    public void setMorningPressure(String morningPressure) {
        this.morningPressure = morningPressure;
    }

    public String getEveningPressure() {
        return eveningPressure;
    }

    public void setEveningPressure(String eveningPressure) {
        this.eveningPressure = eveningPressure;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getPulse() {
        return pulse;
    }

    public void setPulse(Long pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return "PressureDate{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", morningPressure='" + morningPressure + '\'' +
                ", eveningPressure='" + eveningPressure + '\'' +
                ", comment='" + comment + '\'' +
                ", pulse=" + pulse +
                '}';
    }
}
