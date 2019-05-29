package com.example.demo.citizens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    PersonRepository personRepository;


    static class CityR {
        String name;
        int amountofUsers;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAmountofUsers() {
            return amountofUsers;
        }

        public void setAmountofUsers(int amountofUsers) {
            this.amountofUsers = amountofUsers;
        }

        public CityR() {
        }

        public CityR(String name, int amountofUsers) {
            this.name = name;
            this.amountofUsers = amountofUsers;
        }
    }

    @GetMapping(path = "city/all")

    public Iterable<CityR> allCities() {
        List<CityR> list = new ArrayList<>();

        Iterable<City> all = cityRepository.findAll();
        for (City city: all) {
            CityR cityR = new CityR();
            cityR.name = city.name;
            cityR.amountofUsers = city.persons.size();
            list.add(cityR);
        }

        return list;
    }

    @GetMapping(path = "city/persons")
    public Iterable<Person> allPerson() {
        return  personRepository.findAll();
    }


    @GetMapping(path = "city/frontend/all")
    public ModelAndView cities() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities");
        modelAndView.addObject("cities", cityRepository.findAll());
        return modelAndView;
    }

    @GetMapping(path = "city/frontend/add")
    public String get(Model model) {
        City city = new City();
        model.addAttribute("city", city);
        return "addcity";
    }

    @PostMapping(path = "/city/frontend/add")
    public String addNewCity(Model model,  @ModelAttribute("city") City city) {
        cityRepository.save(city);
        return "addcity";
    }
}
