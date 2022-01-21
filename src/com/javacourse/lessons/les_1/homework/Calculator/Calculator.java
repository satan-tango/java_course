package com.javacourse.lessons.les_1.homework.Calculator;

import java.util.Scanner;
//I indertand what you wanted to do. But let's be realistic: have you ever seen a calculator where we could enter a String? :)
//We do not have to overthink. Be simplier. Your code is hard to read. If you want to use this logic and show your knowledge than do it 
//in code friendly way:::)
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flagException  = true;
        String firstNumber = "";
        String secondNumber = "";
        while (flagException) {
            System.out.println("Enter two numbers : ");
            System.out.print("first ------------------------- ");
            firstNumber = scan.next();
            System.out.print("second ------------------------- ");
            secondNumber = scan.next();
            try {
                double firstDoubleValue = Double.parseDouble(firstNumber);
                firstDoubleValue = Double.parseDouble(secondNumber);
                flagException = false;
            } catch(NumberFormatException ex) {
                System.out.println("Error, incorrect data");
                //also you don't need this line. System.out.println("Error, incorrect data\n"); can be used instead.
                System.out.println();
                flagException = true;
            }
        }
        


        String numberOperation ="";
        flagException = true;
        while (flagException) {
            System.out.println("1 - SUM");
            System.out.println("2 - DIVISION");
            System.out.println("3 - DIFFERENCE");
            System.out.println("4 - MULTIPLICATION");
            System.out.print("Choose operation: ");
            numberOperation = scan.next();

            try {
                double  operationDoubleValue = Double.parseDouble(numberOperation);
                flagException = false;
            } catch(NumberFormatException ex) {
                System.out.println();
                System.out.println("Error, incorrect data");
                System.out.println();
                continue;
            }
            if (Double.parseDouble(numberOperation)<0 || Double.parseDouble(numberOperation)>4) {
                System.out.println();
                System.out.println("Error, incorrect data");
                System.out.println();
                flagException = true;
            }
        }


        switch (numberOperation) {
                //same as for previous about case
            case "1": {
                // use \n
                System.out.println();
                System.out.println(firstNumber + " + " + secondNumber + " = " + (Double.parseDouble(firstNumber)+Double.parseDouble(secondNumber)));
                break;
            }
            case "2": {
                System.out.println();
                if (secondNumber !="0") {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (Double.parseDouble(firstNumber)/Double.parseDouble(secondNumber)));
                }
                else System.out.println(firstNumber + " / " + secondNumber + " = " + "infinity");
                break;
            }
            case "3": {
                System.out.println();
                System.out.println(firstNumber + " - " + secondNumber + " = " + (Double.parseDouble(firstNumber)-Double.parseDouble(secondNumber)));
                break;
            }
            case "4": {
                System.out.println();
                System.out.println(firstNumber + " * " + secondNumber + " = " + (Double.parseDouble(firstNumber)*Double.parseDouble(secondNumber)));
                break;
            }
        }
    }
}
