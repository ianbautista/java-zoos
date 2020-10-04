package com.lambdaschool.javazoo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimal extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(nullable = false, name = "animalid")
    private Animal animal;

    private String incomingzoo;

    public ZooAnimal() {
    }

    public ZooAnimal(Zoo zoo, Animal animal, String incomingzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal that = (ZooAnimal) o;
        return (this.animal == null ? 0 : this.animal.getAnimalid()) == (that.animal == null ? 0 : that.animal.getAnimalid()) &&
                (this.zoo == null ? 0 : this.zoo.getZooid()) == (that.zoo == null ? 0 : that.zoo.getZooid());
    }

    @Override
    public int hashCode() {
        return 14;
    }
}
