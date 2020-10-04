package com.lambdaschool.javazoo.controllers;

import com.lambdaschool.javazoo.views.AnimalZooCount;
import com.lambdaschool.javazoo.services.AnimalsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    AnimalsServices animalsServices;

    // http://localhost:2019/animals/count
    @GetMapping(value = "/count", produces = "application/json")
    private ResponseEntity<?> getAllAnimals() {
        List<AnimalZooCount> rtnList = animalsServices.getAnimalZooCount();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }
}
