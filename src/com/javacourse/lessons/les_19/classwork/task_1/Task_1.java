package com.javacourse.lessons.les_19.classwork.task_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", Gender.MALE));
        users.add(new User("Alisa", Gender.FEMALE));
        users.add(new User("Olga", Gender.FEMALE));

        outputHello(users);
    }


    public static void outputHello(List<User> list) {
        for (User user : list) {
            user.SayHello();
        }
    }
}
