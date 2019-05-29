package com.example.demo.configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

//
//        if (user != null) {
//            return User.builder()
//                    .username(user.name)
//                    .password(user.password)
//                    .roles(user.roles.toArray(new String[0]))
//                    .build();
//        }

        throw new UsernameNotFoundException("No such user");

//
//        if (s.equals("admin"))
//            return User.builder()
//                    .username("admin")
//                    .password("password")
//                    .roles("ADMIN")
//                    .build();
//
//        if (s.equals("user"))
//            return User.builder()
//                    .username("user")
//                    .password("password")
//                    .roles("USER")
//                    .build();


    }
}
