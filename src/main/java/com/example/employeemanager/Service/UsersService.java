package com.example.employeemanager.Service;

import com.example.employeemanager.Model.User;
import com.example.employeemanager.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepo usersRepo;

    public List<User>getAll()
    {
        return usersRepo.findAll();
    }
}
