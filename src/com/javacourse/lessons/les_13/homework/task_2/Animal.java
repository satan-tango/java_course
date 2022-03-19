package com.javacourse.lessons.les_13.homework.task_2;

//hm, I don't remember interface discussion! Actually for this task it's bad idea.
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}
