package com.javacourse.lessons.les_9.homework.task_9;

public class Task_9 {

    public static void main(String[] args) {
        //Являются ли массивы идентичными
        final int ARRAY_SIZE = 25;
        final int TOP_VALUE = 1;
        final int BOT_VALUE = 1;
        int[] firstArray = new int[ARRAY_SIZE];
        int[] secondArray = new int[ARRAY_SIZE];
        initArray(firstArray, TOP_VALUE, BOT_VALUE);
        initArray(secondArray, TOP_VALUE, BOT_VALUE);
        System.out.print("First array: ");
        outputArray(firstArray);
        System.out.print("\n\nSecond array: ");
        outputArray(secondArray);
        //comparingArrays(...) -> areArraysEqual(...)
        if (comparingArrays(firstArray, secondArray)) {
            System.out.println("\nArrays are equal");
        }else {
            System.out.println("\nArrays are not equal");
        }
    }
//ok, also Arrays.equals(firstArray, secondArray)
    public static boolean comparingArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void initArray(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(max, min);
        }
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
