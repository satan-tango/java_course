package com.javacourse.lessons.les_13.homework.task_2;
//All your classes have 'private String name'. Use inheritance! Use OOP! It helps you to avoid duplication! 
public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void animalSound() {
        System.out.println("M9y m9y");
    }
}
