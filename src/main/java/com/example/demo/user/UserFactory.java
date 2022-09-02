package com.example.demo.user;

import com.example.demo.city.CityDTO;

public class UserFactory {

    private UserFactory() {

    }

    public static UserDTO createUser(User user, CityDTO cityDTO) {
        return new UserDTO(
                user.getName(),
                user.getAge(),
                cityDTO);
    }
}
