package com.lambdaschool.javazoo.services;

import com.lambdaschool.javazoo.models.Animal;
import com.lambdaschool.javazoo.views.AnimalZooCount;

import java.util.List;

public interface AnimalServices {
    List<Animal> getAllAnimals();
    List<AnimalZooCount> getAnimalZooCount();
}
