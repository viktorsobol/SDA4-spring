package com.example.demo.fruits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitsController {

    @Autowired
    FruitsRepository fruitsRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/fruits/all")
    public Iterable<Fruits> getAll() {
        return fruitsRepository.findAll();
    }
}
