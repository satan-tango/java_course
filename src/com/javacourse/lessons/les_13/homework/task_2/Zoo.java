package com.javacourse.lessons.les_13.homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    //https://youtube.com/shorts/bfuulDkRK0o?feature=share
    private List<Animal> listOfAnimal;//currently we use arrays, but ok

    public Zoo() {
        listOfAnimal = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listOfAnimal.add(animal);
    }

    public void soundOff() {
        System.out.println("The zoo has " + listOfAnimal.size() + " animals");//it should be placed in another method. Use decomposition.
        for (Animal animal : listOfAnimal) {
            animal.animalSound();
        }
    }
}
