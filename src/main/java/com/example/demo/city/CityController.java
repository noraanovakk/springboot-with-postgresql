package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CityController implements CityAPI{

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public List<CityDTO> getAllCities() {
        return cityService.findAll()
                .stream()
                .map(CityFactory::createCityDTO)
                .collect(Collectors.toList());
    }
}
