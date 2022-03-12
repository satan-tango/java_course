package com.javacourse.lessons.les_12.classwork.task_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
//when we initialize something we expect to return it and not printing in method, for that create another method. We should split as 
//much as possible to make code less coupled
public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (pickingTypeOfTheArray(scan) == 1) {
            String[] arrayOfWords = new String[initLengthArray(scan)];
            initStringArray(arrayOfWords, scan);
            sortStringArray(arrayOfWords);
            replaceLetter(arrayOfWords, scan);
        } else {
            int[] arrayOfNumbers = new int[initLengthArray(scan)];
            initIntArray(arrayOfNumbers, scan);
            maxElement(arrayOfNumbers);
            returnIndexInputElement(arrayOfNumbers, scan);
            sortIntArray(arrayOfNumbers);
        }
    }

    public static int pickingTypeOfTheArray(Scanner scan) {
        boolean correctData = false;
        int result = 0;
        while (!correctData) {
            System.out.println("1 - Array of words");
            System.out.println("2 - Array of numbers");
            System.out.print("Pick type of the array: ");
            result = scan.nextInt();
            if (result == 1 || result == 2) {
                correctData = true;
                continue;
            }
            System.out.println("Incorrect data, try again");
        }
        return result;
    }

    public static int initLengthArray(Scanner scan) {
        int length = 0;
        while (length <= 0) {
            System.out.print("Input array length: ");
            length = scan.nextInt();
        }
        return length;
    }

    public static void initIntArray(int[] array, Scanner scan) {
        boolean isCorrectData = false;
        int typeOfInit = 0;
        while (!isCorrectData) {
            System.out.println("1 - by myself");
            System.out.println("2 - random numbers");
            System.out.print("Pick type of initialization: ");
            typeOfInit = scan.nextInt();
            if (typeOfInit == 1 || typeOfInit == 2) {
                isCorrectData = true;
                continue;
            }
            System.out.println("Incorrect data, try again");
        }
//could be another method
        if (typeOfInit == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Input value of " + i + " element: ");
                array[i] = scan.nextInt();
            }
        } else {//could be another method
            for (int i = 0; i < array.length; i++) {
                array[i] = randomNumber(100, 10);
            }
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
    }

    public static void initStringArray(String[] array, Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input value of " + (i + 1) + " word: ");
            array[i] = scan.next();
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int maxElement(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            }

        }
        System.out.println("Max element: " + temp);
        return temp;
    }

    public static int returnIndexInputElement(int[] array, Scanner scan) {
        int inputNumber = 0;
        System.out.print("Enter number whose index you want to find: ");
        inputNumber = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (inputNumber == array[i]) {
                System.out.println("Index: " + i);
                return i;
            }
        }
        System.out.println("Index: " + -1);
        return -1;
    }

    public static void sortIntArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(array));
    }

    public static void sortStringArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Array of sort: ");
        System.out.println(Arrays.toString(array));
    }
//logic could be splitted into 2 methods
    public static void replaceLetter(String[] array, Scanner scan) {
        boolean isCorrect = false;
        String letter = "";
        while (!isCorrect) {
            System.out.print("Input letter: ");
            letter = scan.next();
            if (letter.length() == 1) {
                isCorrect = true;
                continue;
            }
            System.out.println("Incorrect data, try again");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace(letter, Integer.toString(randomNumber(100, 10)));
        }
        System.out.println("Array after replacement");
        System.out.println(Arrays.toString(array));
    }
}
