package com.javacourse.lessons.les_6.classwork.work_4;

import java.util.Scanner;

public class Work_4 {
    int arrayOfNumber[];
    int inputNumber;
    Scanner scan;
    final int TOP_RANGE = 400;
    final int BOT_RANGE = 100;

    public static void main(String[] args) {
        new Work_4();
    }

    public Work_4() {
        arrayOfNumber = new int[100];
        initArray();
        inputData();
        if (existenceInArray()) {
            System.out.println("Yep, number in the array");
        }else {
            System.out.println("There is no this number in the array");
        }
    }

    public int randomNumber(int max, int min) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public void initArray() {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = randomNumber(TOP_RANGE, BOT_RANGE);
        }
    }

    public void inputData() {
        scan = new Scanner(System.in);
        System.out.print("Enter number that we need to check for existence in array: ");
        inputNumber = scan.nextInt();
    }

    public boolean existenceInArray() {
        int i = 0;
        boolean flag = false;
        while (i < 100 && !flag) {
            if (arrayOfNumber[i] == inputNumber) {
                flag = true;
            }
            i++;
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
