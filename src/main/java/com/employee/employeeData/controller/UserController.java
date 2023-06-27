package com.employee.employeeData.controller;

import com.employee.employeeData.entity.UserData;
import com.employee.employeeData.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController



public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public UserData createData(@RequestBody UserData userData) {
        return userRepository.save(userData);
    }

//    @GetMapping("user/{userId}")
//    public UserData getuserById(@PathVariable Integer Id) {
//        return userRepository.findById(id).orElse(null);

    }

