package com.javacourse.lessons.les_3.homework.task4;

/*
Постчитать:
        -Четные числа
        -Нечетные числа
        -Всех чисел
*/

public class Task4 {
    public static void main(String[] args) {
        int counter = 0;
        final int LAST_NUMBER = 100;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        int sumAllNumbers = 0;
        while (counter <= LAST_NUMBER) {
            if (counter % 2 == 0) {
                evenNumbersSum += counter;
            }
            if (counter % 2 != 0) {
                oddNumbersSum += counter;
            }
            sumAllNumbers +=counter;
            counter++;
        }
        System.out.printf("Sum even numbers :\t%d\nSum odd numbers :\t%d\nSum all numbers :\t%d",evenNumbersSum,oddNumbersSum,sumAllNumbers);
    }
}
