package com.lambdaschool.javazoo.services;

import com.lambdaschool.javazoo.models.Animal;
import com.lambdaschool.javazoo.views.AnimalZooCount;
import com.lambdaschool.javazoo.repositories.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServicesImpl implements AnimalServices {

    @Autowired
    AnimalsRepository animalsRepository;

    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        animalsRepository.findAll().iterator().forEachRemaining(animals::add);
        return animals;
    }

    @Override
    public List<AnimalZooCount> getAnimalZooCount() {
        return animalsRepository.getAnimalZooCount();
    }
}
