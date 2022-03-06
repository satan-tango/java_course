package com.javacourse.lessons.les_11.homework.password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    //Пользователя просят ввести пароль. Необходимо сделать валидацию:
    // 1. Как минимум 6 символов;
    // 2. Только буквы и цифры;
    // 3. Как минимум две цифры
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = initPassword(scan);
        System.out.println("Password is valid");
        System.out.println("Password: " + password);
    }

    public static String initPassword(Scanner scan) {
        boolean isCorrect = false;
        String pass = "";
        while (!isCorrect) {
            System.out.print("Input password: ");
            pass = scan.next();
            if (isValidPassword(pass)) {
                isCorrect = true;
            } else {
                System.out.println("Password is invalid, try again");
            }
        }
        return pass;
    }

    public static boolean isValidPassword(String pass) {
        if (pass.length() < 6) {
            return false;
        }

        Pattern passPattern = Pattern.compile("[a-zA-Z[0-9]]*");
        Pattern numbers = Pattern.compile("[0-9]");
        Matcher matcher = passPattern.matcher(pass);
        if (!matcher.matches()) {
            return false;
        }

        matcher = numbers.matcher(pass);
        int counter = 0;

        while (matcher.find()) {
            counter++;
        }
        if (counter < 2) {
            return false;
        }
        return true;
    }

}
