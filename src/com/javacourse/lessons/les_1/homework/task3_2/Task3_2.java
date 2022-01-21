package com.javacourse.lessons.les_1.homework.task3_2;

//Пользователь вводит месяц в виде числа от 1 до 12
//        Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).

import java.util.Scanner;
//+
public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month : ");
        int month = scan.nextInt();
        switch (month/3) {
                //actually writing {...} in switch case is rare. Usually just case n: ... break;
            case 0: {
                System.out.println("WINTER");
                break;
            }
            case 1: {
                System.out.println("SPRING");
                break;
            }
            case 2: {
                System.out.println("SUMMER");
                break;
            }
            case 3: {
                System.out.println("AUTUMN");
                break;
            }
        }
    }
}
