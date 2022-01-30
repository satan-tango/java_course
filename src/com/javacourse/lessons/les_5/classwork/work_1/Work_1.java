package com.javacourse.lessons.les_5.classwork.work_1;

import java.util.Scanner;

public class Work_1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int statusProgram = 1;
        double firstNumber = 0;
        double secondNumber = 0;
        String symbolOfTheOperation = "";
        while (statusProgram ==1) {
            System.out.print("Input first number: ");
            firstNumber = scan.nextDouble();
            System.out.print("Input second number: ");
            secondNumber = scan.nextDouble();
            System.out.println("+");
            System.out.println("-");
            System.out.println("/");
            System.out.println("*");
            System.out.print("Choose operation: ");
            symbolOfTheOperation = scan.next();
            switch (symbolOfTheOperation) {
                case "+":
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "*":
                    System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
                    break;
                case "/":
                    if (secondNumber != 0) {
                        System.out.printf("%.2f / %.2f = %.2f\n", firstNumber, secondNumber, firstNumber / secondNumber);
                    } else {
                        System.out.printf("%.2f / %.2f = Infinity\n", firstNumber, secondNumber);
                    }
                    break;
            }
            System.out.println("1 - go more");
            System.out.println("2 - exit");
            System.out.print("Chose status: ");
            statusProgram = scan.nextInt();
        }
    }
}
