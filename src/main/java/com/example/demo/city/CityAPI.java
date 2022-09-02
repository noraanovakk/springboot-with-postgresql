package com.example.demo.city;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/city")
public interface CityAPI {

    @GetMapping("/getAll")
    ResponseEntity<List<CityDTO>> getAllCities();
}
