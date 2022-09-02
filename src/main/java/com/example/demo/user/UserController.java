package com.example.demo.user;

import com.example.demo.city.City;
import com.example.demo.city.CityDTO;
import com.example.demo.city.CityFactory;
import com.example.demo.city.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class UserController implements UserAPI {

    private final UserService userService;
    private final CityService cityService;

    @Autowired
    public UserController(UserService userService, CityService cityService) {
        this.userService = userService;
        this.cityService = cityService;
    }

    @Override
    public ResponseEntity<List<UserDTO>> getAll() {
        List<UserDTO> dtos = userService.findAll()
                .stream()
                .map(user -> {
                    CityDTO cityDTO = CityFactory.createCityDTO(user.getCity());
                    return UserFactory.createUser(user, cityDTO);
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    @Override
    public ResponseEntity<List<UserDTO>> getAllByCityId(long cityId) {
        List<UserDTO> dtos = userService.findByCityId(cityId)
                .stream()
                .map(user -> {
                    CityDTO cityDTO = CityFactory.createCityDTO(user.getCity());
                    return UserFactory.createUser(user, cityDTO);
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    @Override
    public ResponseEntity<List<UserDTO>> getAllByCity(CityDTO cityDTO) {
        Optional<City> city = cityService.findByName(cityDTO.getName());
        if (city.isEmpty()) {
            log.error("City with name: {} not found", cityDTO.getName());
            return ResponseEntity.notFound().build();
        }
        List<UserDTO> userDTOS = userService.findByCity(city.get())
                .stream()
                .map(user -> UserFactory.createUser(user, cityDTO))
                .collect(Collectors.toList());
        return ResponseEntity.ok(userDTOS);
    }
}
