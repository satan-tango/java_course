package com.javacourse.lessons.les_9.homework.taks_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_2 {

    public static void main(String[] args) {
        //Заполнить массив рандомными числами. Вывести второй максимальный и минимальнй элемент

        final int ARRAY_SIZE = 15;
        final int TOP_VALUE = 100;
        final int BOT_VALUE = 10;
        int[] arrayOfNumber = new int[ARRAY_SIZE];

        initArray(arrayOfNumber, TOP_VALUE, BOT_VALUE);
        outputArray(arrayOfNumber);
        System.out.println("\nSecond max value: "+secondTopValue(arrayOfNumber));
        System.out.println("Second min value: "+secondBotValue(arrayOfNumber));
    }

    public static void initArray(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(max, min);
        }
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int secondTopValue(int[] array) {
        int[] copyArray = new int[array.length];
        copyArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < copyArray.length - 1; i++) {
            for (int j = 0; j < copyArray.length - 1 - i; j++) {
                if (copyArray[j] > copyArray[j + 1]) {
                    temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
            if (i == 1) {
                return copyArray[copyArray.length - 2];
            }
        }
        return copyArray[copyArray.length - 2];
    }

    public static int secondBotValue(int[] array) {
        int[] copyArray = new int[array.length];
        copyArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < copyArray.length - 1; i++) {
            for (int j = 0; j < copyArray.length - 1 - i; j++) {
                if (copyArray[j] < copyArray[j + 1]) {
                    temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
            if (i == 1) {
                return copyArray[copyArray.length - 2];
            }
        }
        return copyArray[copyArray.length - 2];
    }

    public static void outputArray(int[] array) {
        System.out.print("Resulting array: ");
        for (int value : array) {
            System.out.print(value+" ");
        }
    }
}