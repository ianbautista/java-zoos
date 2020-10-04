package com.lambdaschool.javazoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zoo", orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo")
    private Set<Telephone> phones = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zoo", orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private Set<ZooAnimal> animals = new HashSet<>();

    public Zoo() {
    }

    public Zoo(String zooname, Set<Telephone> phones) {
        this.zooname = zooname;
        this.phones = phones;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public Set<Telephone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Telephone> phones) {
        this.phones = phones;
    }

    public Set<ZooAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<ZooAnimal> animals) {
        this.animals = animals;
    }
}
