package com.example.demo.users_s;

import com.example.demo.configuration.UserDetailsServiceImpl;
import com.example.demo.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/user")
    public String get() {
        return "Hello";
    }

    @GetMapping(path = "/currentUserName")
    public String getCurrentLoggedInUser(Principal principal) {

        return principal.getName();
    }


}
