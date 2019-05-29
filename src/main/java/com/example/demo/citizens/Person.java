package com.example.demo.citizens;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    Long id;

    String name;

    @ManyToOne
    City city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Person() {
    }

    public Person(Long id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}
