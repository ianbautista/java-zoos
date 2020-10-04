package com.lambdaschool.javazoo.controllers;

import com.lambdaschool.javazoo.models.Zoo;
import com.lambdaschool.javazoo.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooServices zooServices;

    @GetMapping(value = "/zoos", produces = "application/json")
    private ResponseEntity<?> getAllZoos() {
        List<Zoo> zoos = zooServices.getAllZoos();
        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{id}", produces = "application/json")
    private ResponseEntity<?> getById(@PathVariable long id) {
        Zoo z = zooServices.getZooById(id);
        return new ResponseEntity<>(z, HttpStatus.OK);
    }
}
