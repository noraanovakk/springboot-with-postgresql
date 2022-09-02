package com.example.demo.user;

import com.example.demo.city.CityDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
public interface UserAPI {

    @GetMapping("/getAll")
    ResponseEntity<List<UserDTO>> getAll();

    @GetMapping("/getAll/city/{cityId}")
    ResponseEntity<List<UserDTO>> getAllByCityId(@PathVariable long cityId);

    @PostMapping("/getAll/city")
    ResponseEntity<List<UserDTO>> getAllByCity(@RequestBody CityDTO city);
}
