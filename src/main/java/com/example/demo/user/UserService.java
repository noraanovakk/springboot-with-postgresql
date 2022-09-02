package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<User> findByCityId(long cityId) {
        return userRepository.findByCityId(cityId);
    }
}
