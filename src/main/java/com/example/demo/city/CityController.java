package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CityController implements CityAPI{

    private final ICityService iCityService;

    @Autowired
    public CityController(ICityService iCityService) {
        this.iCityService = iCityService;
    }

    @Override
    public ResponseEntity<List<CityDTO>> getAllCities() {
        List<CityDTO> dtos = iCityService.findAll()
                .stream()
                .map(CityFactory::createCityDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }
}
