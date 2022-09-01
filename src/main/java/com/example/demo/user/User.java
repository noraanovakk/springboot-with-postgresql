package com.example.demo.user;

import com.example.demo.city.City;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    private int age;

    @JoinColumn(name = "city_id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private City city;
}
