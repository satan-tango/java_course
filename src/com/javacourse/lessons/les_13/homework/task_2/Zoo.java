package com.javacourse.lessons.les_13.homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listOfAnimal;

    public Zoo() {
        listOfAnimal = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listOfAnimal.add(animal);
    }

    public void soundOff() {
        System.out.println("The zoo has " + listOfAnimal.size() + " animals");
        for (Animal animal : listOfAnimal) {
            animal.animalSound();
        }
    }
}
