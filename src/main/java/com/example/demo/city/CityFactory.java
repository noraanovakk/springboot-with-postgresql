package com.example.demo.city;

public class CityFactory {

    public static CityDTO createCityDTO(City city) {
        return new CityDTO(city.getName(), city.getPopulation());
    }
}
