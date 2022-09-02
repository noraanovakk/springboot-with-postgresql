package com.example.demo.user;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    List<User> findByCityId(long cityId);
}
