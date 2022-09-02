package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/user")
public interface UserAPI {

    @GetMapping("/getAll")
    public List<UserDTO> getAll();

    @GetMapping("/getAll/city/{cityId}")
    public List<UserDTO> getAllByCityId(@PathVariable long cityId);
}
