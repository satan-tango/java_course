package com.javacourse.lessons.les_18.classwork.task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> persons = new HashMap<>();
        Person person1 = new Person("Pasha", 27);
        Person person2 = new Person("Andrei", 22);
        Person person3 = new Person("Gena", 30);

        persons.put(person1.getName(), person1.getAge());
        persons.put(person2.getName(), person2.getAge());
        persons.put(person3.getName(), person3.getAge());
        outputPersonsInAgeRange(persons, scan);
    }

    public static void outputPersonsInAgeRange(Map<String, Integer> map, Scanner scan) {
        int topRange = 0;
        int botRange = 0;
        System.out.print("Input top range: ");
        topRange = scan.nextInt();
        System.out.print("Input bot range: ");
        botRange = scan.nextInt();
        System.out.println("Persons in age range: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= botRange && entry.getValue() <= topRange) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
