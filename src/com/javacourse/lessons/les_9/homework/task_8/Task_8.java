package com.javacourse.lessons.les_9.homework.task_8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_8 {

    public static void main(String[] args) {
        //Найти дубпликаты в массиве char

        final int ARRAY_SIZE = 400;
        final int TOP_VALUE = 'z';
        final int BOT_VALUE = 'a';
        char[] arrayOfChar = new char[ARRAY_SIZE];
        initArray(arrayOfChar, TOP_VALUE, BOT_VALUE);
        //also we can not sort an array and you second for loop in outputDuplicate(...)
        sortArray(arrayOfChar);
        outputArray(arrayOfChar);
        outputDuplicate(arrayOfChar);
    }

    public static void initArray(char[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) randomNumber(max, min);
        }
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void outputArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            //30? Reason? 
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    public static void sortArray(char[] array) {
        char temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void outputDuplicate(char[] array) {
        int duplicates = 1;
        char temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp == array[i]) {
                duplicates++;
            } else {
                System.out.printf("%c amount of duplicates are %d\n", temp, duplicates);
                duplicates = 1;
                temp = array[i];
            }
            if (i == array.length - 1) {
                System.out.printf("%c amount of duplicates are %d\n", temp, duplicates);
            }
        }
    }
}
