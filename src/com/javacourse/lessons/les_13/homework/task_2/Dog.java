package com.javacourse.lessons.les_13.homework.task_2;
//All your classes have 'private String name'. Use inheritance! Use OOP! It helps you to avoid duplication! 
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Gav gav");
    }
}
