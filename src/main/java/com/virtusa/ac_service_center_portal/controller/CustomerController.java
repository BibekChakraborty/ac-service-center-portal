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

import com.virtusa.ac_service_center_portal.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> getAll(){
        return new ArrayList<Customer>();
    }
    
    @GetMapping("/{id}")
    public Customer get(@PathVariable Long id){
        return new Customer();
    }

    @PostMapping
    public Long create(@RequestBody Customer customer){
        return customer.getId();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Customer customer){}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){}

}
