package com.javacourse.lessons.les_1.homework.task2_1;

import java.util.Scanner;

//Пользователь вводит 3 числа. Найти максимальное и вывести его.
//        Решить 2 способами: 1-через вложенный if,
//        т.е if(condition){if(condition)…}…, 2 – используя логические операции

//+
public class Task2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int biggestNumber;
        
//please do not left commented code like this, it's a very bad practise.
//i like your solution with biggestNumber and taking in mind case when numbers can be equal


        ///////////FIRST OPTION///////////

//        if (firstNumber >= secondNumber) {
//            if(firstNumber>=thirdNumber) {
//                biggestNumber = firstNumber;
//            } else {
//                biggestNumber = thirdNumber;
//            }
//        } else {
//            if(secondNumber>=thirdNumber) {
//                biggestNumber = secondNumber;
//            } else {
//                biggestNumber = thirdNumber;
//            }
//        }

        ///////////SECOND OPTION///////////

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            biggestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            biggestNumber = secondNumber;
        } else biggestNumber = thirdNumber;
//good!
        System.out.printf("The biggest number is %d", biggestNumber);
    }
}
