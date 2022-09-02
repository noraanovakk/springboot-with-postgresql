package com.example.demo.city;

import java.util.List;
import java.util.Optional;

public interface ICityService {

    List<City> findAll();

    Optional<City> findByName(String name);
}
