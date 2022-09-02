package com.example.demo.user;

import com.example.demo.city.CityDTO;
import com.example.demo.city.CityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController implements UserAPI {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserDTO> getAll() {
        return userService.findAll()
                .stream()
                .map(user -> {
                    CityDTO cityDTO = CityFactory.createCityDTO(user.getCity());
                    return UserFactory.createUser(user, cityDTO);
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getAllByCityId(long cityId) {
        return userService.findByCityId(cityId)
                .stream()
                .map(user -> {
                    CityDTO cityDTO = CityFactory.createCityDTO(user.getCity());
                    return UserFactory.createUser(user, cityDTO);
                })
                .collect(Collectors.toList());
    }
}
