package com.sergey.zakirov.pressure_app_rest.repository;

import com.sergey.zakirov.pressure_app_rest.model.PressureData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PressureDataRepository extends JpaRepository<PressureData, Long> {

}
