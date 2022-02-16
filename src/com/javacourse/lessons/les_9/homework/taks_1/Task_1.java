package com.javacourse.lessons.les_9.homework.taks_1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        //Заполинть массив из консоли, если пользователь вводит отрицательное число закончить программу.

        Scanner scan = new Scanner(System.in);
        int[] arrayOfNumber;
        boolean negativeNumber;

        arrayOfNumber = new int[arraySize(scan)];
        negativeNumber = initArray(arrayOfNumber, scan);
        if (!negativeNumber) {
            outputArray(arrayOfNumber);
        }
    }

    public static int arraySize(Scanner scan) {
        boolean incorrectData = true;
        int size = 0;
        int size1;
        while (incorrectData) {
            System.out.print("Enter array size: ");
            if (scan.hasNextInt()) {
                size = Integer.parseInt(scan.nextLine());
                if (size <= 0) {
                    System.out.println("Size must be positive");
                    continue;
                }
                incorrectData = false;
            } else {
                scan.nextLine();
                System.out.println("Something went wrong, try again");
            }
        }
        return size;
    }

    public static boolean initArray(int[] array, Scanner scan) {
        int index = 0;
        int number;
        boolean negativeNumber = false;
        while (index < array.length) {
            System.out.print("Enter the value of " + "[" + (index + 1) + "] element: ");
            if (scan.hasNextInt()) {
                number = Integer.parseInt(scan.nextLine());
                if (number < 0) {
                    System.out.println("There is a negative number in the array!");
                    negativeNumber = true;
                    break;
                }
                array[index] = number;
                index++;
            } else {
                scan.nextLine();
                System.out.println("Something went wrong, try again");
            }
        }
        return negativeNumber;
    }

    public static void outputArray(int[] array) {
        System.out.print("Resulting array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
