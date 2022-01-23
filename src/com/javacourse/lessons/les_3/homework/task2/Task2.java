package com.javacourse.lessons.les_3.homework.task2;

//Вывести четные чила от 2 до 100 включительно

public class Task2 {
    public static void main(String[] args) {
        final int LAST_NUMBER = 100;
        System.out.println("Even numbers:");
        for (int i = 2; i <= LAST_NUMBER; i++) {
            if (i % 2 == 0) {
                System.out.println(+i);
            }
        }
    }
}
