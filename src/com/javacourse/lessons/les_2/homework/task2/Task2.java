package com.javacourse.lessons.les_2.homework.task2;

//Вычестлить A*B без операции умножения.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entire first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Entire second number: ");
        int secondNumber = scan.nextInt();
        int result = 0;
        for (int i = 0; i < secondNumber; i++) {
            result +=firstNumber;
        }
        System.out.println("Result is " + result);
    }
}
