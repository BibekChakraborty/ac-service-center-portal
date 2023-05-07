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

import com.virtusa.ac_service_center_portal.model.Repair;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @GetMapping
    public List<Repair> getAll(){
        return new ArrayList<Repair>();
    }

    @GetMapping("/{id}")
    public Repair get(@PathVariable Long id){
        return new Repair(); 
    }

    @PostMapping
    public Long create(@RequestBody Repair repair){
        return repair.getId();
    }

    @PutMapping("/id")
    public void update(@PathVariable Long id,@RequestBody Repair repair){}

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){}

}
