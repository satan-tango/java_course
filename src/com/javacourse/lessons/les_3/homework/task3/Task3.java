package com.javacourse.lessons.les_3.homework.task3;
//+
public class Task3 {
    public static void main(String[] args) {
        int counter = 1;
        final int LAST_NUMBER = 99;
        int sumResult = 0;
        while (counter <= LAST_NUMBER) {
            if (counter % 2 != 0) {
                sumResult +=counter;
            }
            counter++;
        }
        System.out.println("Sum all odd numbers from 1 to 99 is " + sumResult);
    }
}
