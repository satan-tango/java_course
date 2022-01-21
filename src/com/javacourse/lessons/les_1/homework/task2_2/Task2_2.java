package com.javacourse.lessons.les_1.homework.task2_2;

import java.util.Scanner;

// Пользователь вводит 2 числа. Проверить кратное ли первое второму

//yes I have changed it due to some guys misunderstanding. But it's correct either.
//+
// Я так понял, тwswwwwwwwwы поменяла условие,я сделал, как было изначально:  2 -  y кратное ли x. x - первое чилло, y  - второе.

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Is (2 - secondNumber) % firstNumber = 0 ?");
        if((2-secondNumber) % firstNumber == 0 ){
            System.out.println("Result is positive");
        }else System.out.println("Result is negative");//please do not forget {...}
    }
}
