package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<CityDTO> getAllCities() {
        return iCityService.findAll()
                .stream()
                .map(CityFactory::createCityDTO)
                .collect(Collectors.toList());
    }
}
