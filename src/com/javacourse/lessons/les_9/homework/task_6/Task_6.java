package com.javacourse.lessons.les_9.homework.task_6;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        //Удалить из массива определенное число

        final int ARRAY_SIZE = 15;
        final int TOP_VALUE = 100;
        final int BOT_VALUE = 10;
        int[] arrayOfNumber = new int[ARRAY_SIZE];
        int[] changedArray = new int[arrayOfNumber.length - 1];
        int deletionIndex;
        Scanner scan = new Scanner(System.in);

        initArray(arrayOfNumber, TOP_VALUE, BOT_VALUE);
        outputArrayWithIndex(arrayOfNumber);
        System.out.print("Enter index of the element that will be deleted: ");
        deletionIndex = scan.nextInt();

        initChangedArray(deletionIndex, arrayOfNumber, changedArray);
        outputArray(changedArray);
    }

    public static void initChangedArray(int deletedElement, int[] sourceArray, int[] newArray) {
        int index = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            //you compare with index, not the element itself.  if (deletedElement == sourceArray[i])
            if (deletedElement == i) {
                continue;
            }
            newArray[index] = sourceArray[i];
            index++;
        }
    }

    public static void initArray(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(max, min);
        }
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void outputArrayWithIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] - %d\t\t", i, array[i]);
            //what is 5? What is the purpose of this method?
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static void outputArray(int[] array) {
        System.out.print("New array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
