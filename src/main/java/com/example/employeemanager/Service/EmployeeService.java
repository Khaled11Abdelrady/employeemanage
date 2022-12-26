package com.example.employeemanager.Service;

import com.example.employeemanager.Exception.UserNotFoundException;
import com.example.employeemanager.Model.Employee;
import com.example.employeemanager.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee createEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return  employeeRepository.save(employee);
    }
    public List<Employee> getAll(){
        return  employeeRepository.findAll();
    }
    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public Employee findEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("User by this id "+id+" was`t found"));
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
