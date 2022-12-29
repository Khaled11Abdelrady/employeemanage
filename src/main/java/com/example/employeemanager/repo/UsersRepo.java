package com.example.employeemanager.repo;

import com.example.employeemanager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User,Long> {

}
