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

import com.virtusa.ac_service_center_portal.model.Device;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @GetMapping
    public List<Device> getAll(){
        return new ArrayList<Device>();
    }

    @GetMapping("/{id}")
    public Device get(@PathVariable Long id){
        return new Device(); 
    }

    @PostMapping
    public Long create(@RequestBody Device device){
        return device.getId();
    }

    @PutMapping("/id")
    public void update(@PathVariable Long id,@RequestBody Device device){}

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){}

}
