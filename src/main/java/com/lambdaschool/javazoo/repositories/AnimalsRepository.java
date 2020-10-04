package com.lambdaschool.javazoo.repositories;

import com.lambdaschool.javazoo.models.Animal;
import com.lambdaschool.javazoo.views.AnimalZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalsRepository extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT animals.animaltype animaltype, animals.animalid, count(zooanimals.zooid) zoocount " +
            "FROM animals " +
            "JOIN zooanimals " +
            "ON zooanimals.animalid = animals.animalid " +
            "GROUP BY animaltype", nativeQuery = true)
    List<AnimalZooCount> getAnimalZooCount();
}
