package com.example.demo.user;

import com.example.demo.city.City;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    private int age;

    @JoinColumn(name = "city_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
}
