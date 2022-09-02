package com.example.demo.user;

import com.example.demo.city.City;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    List<User> findByCityId(long cityId);

    List<User> findByCity(City city);
}
