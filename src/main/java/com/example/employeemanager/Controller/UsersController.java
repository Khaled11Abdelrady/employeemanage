package com.example.employeemanager.Controller;

import com.example.employeemanager.Model.User;
import com.example.employeemanager.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersController {
    @Autowired
    UsersService usersService;
    @GetMapping("/all")
    public List<User> getAll()
    {
        return usersService.getAll();
    }
}
