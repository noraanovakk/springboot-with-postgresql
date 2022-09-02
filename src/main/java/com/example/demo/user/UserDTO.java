package com.example.demo.user;

import com.example.demo.city.CityDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private String name;
    private int age;
    private CityDTO city;
}
