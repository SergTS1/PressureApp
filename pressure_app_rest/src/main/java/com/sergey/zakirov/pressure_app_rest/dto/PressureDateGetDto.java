package com.sergey.zakirov.pressure_app_rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDateTime;


@Schema(description = "Данные измерений")
public class PressureDateGetDto implements Serializable {

    @Schema(description = "Id")
    private Long id;

    @Schema(description = "Дата измерения")
    private LocalDateTime localDateTime;

    @Schema(description = "Утреннее измерение")
    private String morningPressure;

    @Schema(description = "Вечернее измерение")
    private String eveningPressure;

    @Schema(description = "Комментарий по дате")
    private String comment;

    @Schema(description = "Измерение пульса")
    private Long pulse;

    public PressureDateGetDto() {
    }

    public PressureDateGetDto(Long id, LocalDateTime localDateTime, String morningPressure, String eveningPressure, String comment, Long pulse) {
        this.id = id;
        this.localDateTime = localDateTime;
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
        return "PressureDateGetDto{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", morningPressure='" + morningPressure + '\'' +
                ", eveningPressure='" + eveningPressure + '\'' +
                ", comment='" + comment + '\'' +
                ", pulse=" + pulse +
                '}';
    }
}
