package com.javacourse.lessons.les_8.classwork.work_1;

import java.util.Scanner;

public class Work_1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        final int MAX_RANGE = 100;
//        final int BOT_RANGE = 10;
//        System.out.print("Enter array size: ");
        int[] arrayOfNumber = {5, 4, 3, 2, 1};
//        for (int i = 0; i < arrayOfNumber.length; i++) {
//            arrayOfNumber[i] = randomNumber(MAX_RANGE, BOT_RANGE);
//        }

        int temp = 0;
        for (int i = 0; i < arrayOfNumber.length - 1; i++) {
            for (int j = 0; j < arrayOfNumber.length - 1 - i; j++) {
                if (arrayOfNumber[j] > arrayOfNumber[j + 1]) {
                    temp = arrayOfNumber[j];
                    arrayOfNumber[j] = arrayOfNumber[j + 1];
                    arrayOfNumber[j + 1] = temp;
                }
            }
        }
        for (int number : arrayOfNumber) {
            System.out.print(number + " ");
        }
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
