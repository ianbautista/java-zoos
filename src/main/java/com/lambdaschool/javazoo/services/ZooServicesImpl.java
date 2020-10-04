package com.lambdaschool.javazoo.services;

import com.lambdaschool.javazoo.models.Zoo;
import com.lambdaschool.javazoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ZooServicesImpl implements ZooServices {

    @Autowired
    ZooRepository zooRepository;

    @Override
    public List<Zoo> getAllZoos() {
        List<Zoo> zoos = new ArrayList<>();
        zooRepository.findAll().iterator().forEachRemaining(zoos::add);
        return zoos;
    }

    @Override
    public Zoo getZooById(long id) {
        Zoo z = zooRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Zoo with id %d not found", id)));
        return z;
    }
}
