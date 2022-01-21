package com.javacourse.lessons.les_1.homework.task2_3;

import java.util.Scanner;

//Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.
//+
public class Task2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scan.nextInt();

// Первый день - понедельник.

        int value=0;
        //nice! Totally agree that it's much more beatiful to check first of all <=0 instead of writing values verification :)
        if (number <=0) {
            System.out.println("Error, number must be positive");
        }
        else {
            //7 is "magic" number. Better to use const: final int numberOfDays = 7;
            //nice implementation with % ! But I don't actually think it would be user friendly
            value = number % 7;
            // Consider value = 1. Do we need to check other if-s? Or we can write else if and do not take care of unnecessary checking?
            if (value == 1) {
                System.out.println("MONDAY");
            }
            if (value == 2) {
                System.out.println("TUESDAY");
            }
            if (value == 3) {
                System.out.println("WEDNESDAY");
            }
            if (value == 4) {
                System.out.println("THURSDAY");
            }
            if (value == 5) {
                System.out.println("FRIDAY");
            }
            if (value == 6) {
                System.out.println("SATURDAY");
            }
            if (value == 0) {
                System.out.println("SUNDAY");
            }
        }
    }
}
