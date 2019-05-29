package com.example.demo.fruits;

import com.example.demo.fruits.repositories.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitsController {

    @Autowired
    FruitsRepository fruitsRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/fruits/all")
    public Iterable<Fruits> getAll() {
        return fruitsRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fruits/name")
    public Iterable<Fruits> get(@RequestParam("name") String name) {
        return fruitsRepository.findAllByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/fruits/new")
    public void newFruit(@RequestBody Fruits fruit) {
        fruitsRepository.save(fruit);
    }
}
