package com.javacourse.lessons.les_10.homework.task_1;

import java.util.Scanner;

public class Task_1 {

    //Есть предложение. Пользователь вводит букву.
    // Определить, есть ли эта буква в предложении.
    // Использовать метод класса String
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = initString(scan);
        isContainChar(inputString, scan);
    }

    public static String initString(Scanner scan) {
        String str = "";
        System.out.print("Enter string: ");
        return str = scan.next();
    }

    public static void isContainChar(String sourceString, Scanner scan) {
        String symbol = "";
        boolean isChar = false;
        while (!isChar) {
            System.out.print("Enter character: ");
            symbol = scan.next();
            if (symbol.length() != 1) {
                System.out.println("Something went wrong, try again");
                continue;
            }
            isChar = true;
        }
        if (sourceString.contains(symbol)) {
            System.out.println("Input string contains input char");
        } else {
            System.out.println("Input string doesn't contain input char");
        }
    }

}
