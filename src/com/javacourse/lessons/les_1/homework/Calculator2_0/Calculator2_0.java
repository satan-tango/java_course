package com.javacourse.lessons.les_1.homework.Calculator2_0;

import java.util.Scanner;

public class Calculator2_0 {

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
                System.out.println();
                flagException = true;
            }
        }


        String symbolOperation ="";
        flagException = true;
        while (flagException) {
            System.out.println("'+' - SUM");
            System.out.println("'/' - DIVISION");
            System.out.println("'-' - DIFFERENCE");
            System.out.println("'*' - MULTIPLICATION");
            System.out.print("Choose operation: ");
            symbolOperation = scan.next();

            if (symbolOperation.equals("+") || symbolOperation.equals("-") || symbolOperation.equals("/")
                    || symbolOperation.equals("*")) {
                flagException = false;
            } else{
                System.out.println();
                System.out.println("Error, incorrect data");
                System.out.println();
                flagException = true;
            }
        }


        switch (symbolOperation) {
            case "+": {
                System.out.println();
                System.out.println(firstNumber + " + " + secondNumber + " = " + (Double.parseDouble(firstNumber)+Double.parseDouble(secondNumber)));
                break;
            }
            case "/": {
                System.out.println();
                if (secondNumber !="0") {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (Double.parseDouble(firstNumber)/Double.parseDouble(secondNumber)));
                }
                else System.out.println(firstNumber + " / " + secondNumber + " = " + "infinity");
                break;
            }
            case "-": {
                System.out.println();
                System.out.println(firstNumber + " - " + secondNumber + " = " + (Double.parseDouble(firstNumber)-Double.parseDouble(secondNumber)));
                break;
            }
            case "*": {
                System.out.println();
                System.out.println(firstNumber + " * " + secondNumber + " = " + (Double.parseDouble(firstNumber)*Double.parseDouble(secondNumber)));
                break;
            }
        }
    }
}
