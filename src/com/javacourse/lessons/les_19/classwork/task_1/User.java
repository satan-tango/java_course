package com.javacourse.lessons.les_19.classwork.task_1;

public class User {

    private String name;
    private Gender gender;

    public User(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void SayHello() {
        if (gender.name() == Gender.MALE.name()) {
            System.out.println("Hello, men");
        } else {
            System.out.println("Hello, women");
        }
    }
}
