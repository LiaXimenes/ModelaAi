package com.modelaai.ModelaAi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.ModelaAi.DTO.CarDTO;
import com.modelaai.ModelaAi.model.CarModel;
import com.modelaai.ModelaAi.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<CarModel> carList(){
        return repository.findAll();
    }

    @PostMapping
    public void createCar(@RequestBody CarDTO req){
        repository.save(new CarModel(req));
    }
    
}
