package com.javacourse.lessons.les_19.homework.task_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        String path = "src/com/javacourse/lessons/les_19/homework/task_1/DB.txt";
        DataBase dataBase = new DataBase(path);
        Scanner scan = new Scanner(System.in);
        int programCondition = 0;
        int programOperation = 0;

        String login = "";
        String password = "";
        while (true) {
            System.out.println("1 - registration");
            System.out.println("2 - authorization");
            System.out.println("3 - exit");
            System.out.print("Choose operation: ");
            programCondition = scan.nextInt();
            switch (programCondition) {
                case 1:
                    programOperation = 10;
                    while (true) {
                        System.out.print("Input login:: ");
                        login = scan.next();
                        System.out.print("Input password: ");
                        password = scan.next();
                        Registration registration = new Registration(login, password, dataBase);
                        System.out.println(registration.isCorrectInputData());
                        if (registration.isCorrectInputData().equals(Condition.INCORRECT_LOGIN_LENGTH.getDescription()) ||
                                registration.isCorrectInputData().equals(Condition.INCORRECT_LOGIN.getDescription()) ||
                                registration.isCorrectInputData().equals(Condition.INCORRECT_PASSWORD_LENGTH.getDescription()) ||
                                registration.isCorrectInputData().equals(Condition.INCORRECT_PASSWORD.getDescription()) ||
                                registration.isCorrectInputData().equals(Condition.LOGIN_IN_USE.getDescription())) {
                            System.out.println("1 - try again ");
                            System.out.println("2 - exit");
                            System.out.print("Choose Operation: ");
                            programOperation = scan.nextInt();
                            if (programOperation == 2) {
                                break;
                            }
                        } else {
                            dataBase.addUser(login, password);
                            break;
                        }

                    }
                    break;
                case 2:
                    programOperation = 10;
                    while (true) {
                        System.out.print("Input login: ");
                        login = scan.next();
                        System.out.print("Input password: ");
                        password = scan.next();
                        Authorization authorization = new Authorization(dataBase, login, password);
                        System.out.println(authorization.isValidData());
                        if (authorization.isValidData().equals(Condition.DOES_NOT_EXIST_LOGIN.getDescription())) {
                            System.out.println("1 - try again ");
                            System.out.println("2 - exit");
                            System.out.print("Choose Operation: ");
                            programOperation = scan.nextInt();
                            if (programOperation == 1) {
                                continue;
                            }
                            if (programOperation == 2) {
                                break;
                            }
                        }
                        if (authorization.isValidData().equals(Condition.AUTHORIZED.getDescription())) {
                            break;
                        }
                        while (true) {
                            if (authorization.isValidData().equals(Condition.INVALID_PASSWORD.getDescription())) {
                                System.out.println("1 - try again ");
                                System.out.println("2 - exit");
                                System.out.print("Choose Operation: ");
                                programOperation = scan.nextInt();
                                if (programOperation == 1) {
                                    System.out.println("Input login: " + login);
                                    System.out.print("Input password: ");
                                    password = scan.next();
                                    authorization.setPassword(password);
                                    System.out.println(authorization.isValidData());
                                }
                                if (programOperation == 2) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                case 3:
            }
            if (programCondition == 3) {
                break;
            }
        }
    }
}
