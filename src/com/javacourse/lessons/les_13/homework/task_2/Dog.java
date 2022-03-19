package com.javacourse.lessons.les_13.homework.task_2;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void animalSound() {
        System.out.println("Gav gav");
    }
}
