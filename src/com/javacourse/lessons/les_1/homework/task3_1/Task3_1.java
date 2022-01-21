package com.javacourse.lessons.les_1.homework.task3_1;

import java.util.Scanner;


//Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет
//        (т.е переписать 2.3 с другой конструкцией)
public class Task3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scan.nextInt();

// Первый день - понедельник.

        int value=0;
        if (number <=0) {
            System.out.println("Error, number must be positive");
        }
        else {
            //same as 2.3
            value = number % 7;
            switch (value) {
                case 1: {
                    System.out.println("MONDAY");
                    break;
                }
                case 2: {
                    System.out.println("TUESDAY");
                    break;
                }
                case 3: {
                    System.out.println("WEDNESDAY");
                    break;
                }
                case 4: {
                    System.out.println("THURSDAY");
                    break;
                }
                case 5: {
                    System.out.println("FRIDAY");
                    break;
                }
                case 6: {
                    System.out.println("SATURDAY");
                    break;
                }
                case 0: {
                    System.out.println("SUNDAY");
                    break;
                }
            }
        }
    }
}
