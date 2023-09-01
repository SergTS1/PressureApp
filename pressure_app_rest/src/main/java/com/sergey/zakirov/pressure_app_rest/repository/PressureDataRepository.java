package com.sergey.zakirov.pressure_app_rest.repository;

import com.sergey.zakirov.pressure_app_rest.model.PressureDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PressureDataRepository extends JpaRepository<PressureDate, Long> {

}
