package com.example.demo.city;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CityService {

    List<City> findAll();
}
