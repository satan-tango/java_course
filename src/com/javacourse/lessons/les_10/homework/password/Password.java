package com.javacourse.lessons.les_10.homework.password;

import java.util.Scanner;

public class Password {

    //Пользователя просят ввести пароль. Необходимо сделать валидацию:
    // 1. Как минимум 6 символов;
    // 2. Только буквы и цифры;
    // 3. Как минимум две цифры
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";
        password = initPassword(password, scan);
        System.out.println("Password is " + password);
    }

    public static String initPassword(String pass, Scanner scan) {
        boolean isCorrect = false;
        int amountOfNumbers = 0;
        System.out.println("Follow the next rules: ");
        System.out.println("Length must be at least 6 characters");
        System.out.println("Only characters and numbers");
        System.out.println("At least 2 numbers in the pass");

        while (!isCorrect) {
            isCorrect = true;
            System.out.print("Input password: ");
            pass = scan.next();
            //could be another method like validateLength or isLengthValid...
            if (pass.length() < 6) {
                //tell user what exactly went wrong!
                System.out.println("Something went wrong, try again");
                isCorrect = false;
                continue;
            }
            //could be another method
            for (int i = 0; i < pass.length(); i++) {
                if (isNumber(pass.charAt(i))) {
                    amountOfNumbers++;
                    continue;
                }
                if (!isCharacter(pass.charAt(i))) {
                    isCorrect = false;
                    break;
                }
            }
            if (amountOfNumbers < 2) {
                System.out.println("Something went wrong, try again");
                isCorrect = false;
            }
        }
        return pass;
    }
//+
    public static boolean isCharacter(char symbol) {
        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            return true;
        }
        return false;
    }
//+
    public static boolean isNumber(char symbol) {
        if ((symbol >= '0' && symbol <= '9')) {
            return true;
        }
        return false;
    }
}
