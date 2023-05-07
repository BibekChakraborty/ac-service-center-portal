package com.virtusa.ac_service_center_portal.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.ac_service_center_portal.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAll(){
        return new ArrayList<Employee>();
    }
    @GetMapping("/{id}")
    public Employee get(@PathVariable Long id){
        return new Employee();
    }
    @PostMapping()
    public Long create(@RequestBody Employee employee){
        return employee.getId();
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody Employee employee){}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){}
}
