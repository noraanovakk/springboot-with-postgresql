package com.example.demo.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface CityAPI {

    @GetMapping("/getAll")
    public List<CityDTO> getAllCities();
}
