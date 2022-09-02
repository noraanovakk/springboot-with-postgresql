package com.example.demo.user;

import com.example.demo.city.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByCityId(long id);

    List<User> findByCity(City city);
}
