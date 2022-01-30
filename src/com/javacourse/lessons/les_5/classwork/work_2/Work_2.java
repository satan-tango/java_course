package com.javacourse.lessons.les_5.classwork.work_2;

import java.util.Scanner;

public class Work_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber = 0;
        System.out.print("Input number: ");
        inputNumber = scan.nextInt();
        int oddNumbers = 0;
        int evenNumbers = 0;
        int sumAllNumbers = 0;
        for (int i = 1; i <=inputNumber ; i++) {
            if (i%2 ==0) {
                evenNumbers +=i;
            } else {
                oddNumbers +=i;
            }
        }
        sumAllNumbers = evenNumbers + oddNumbers;
        System.out.printf("EvenNumbers : %d\nOdd Numbers : %d\nSum all Numbers %d",evenNumbers,oddNumbers,sumAllNumbers);
    }
}
