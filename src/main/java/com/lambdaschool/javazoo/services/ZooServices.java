package com.lambdaschool.javazoo.services;

import com.lambdaschool.javazoo.models.Zoo;

import java.util.List;

public interface ZooServices {
    List<Zoo> getAllZoos();

    Zoo getZooById(long id);
}
