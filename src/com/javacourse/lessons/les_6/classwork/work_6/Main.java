package com.javacourse.lessons.les_6.classwork.work_6;

public class Main {
    public static void main(String[] args) {
        int arrayOfTheNumbers[] = {123, 124, 23, 1, 24, 124214, 15, 64, 34};
        int amount = 1;
        for (int i = 0; i < arrayOfTheNumbers.length; i++) {
            if (arrayOfTheNumbers[i] % 2 == 0) {
                amount++;
            }
        }
        int[] arrOFTheEvenNumbers = new int[amount];
        int counter = 0;
        for (int i = 0; i < arrayOfTheNumbers.length; i++) {
            if (arrayOfTheNumbers[i] % 2 == 0) {
                arrOFTheEvenNumbers[counter] = arrayOfTheNumbers[i];
                System.out.println(arrOFTheEvenNumbers[counter]);
                counter++;
            }
        }
    }
}
