package com.modelaai.ModelaAi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.ModelaAi.model.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Long> {
    
}