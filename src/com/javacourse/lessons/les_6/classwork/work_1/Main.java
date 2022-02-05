package com.javacourse.lessons.les_6.classwork.work_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayOFTheNumbers[];
        System.out.print("Input length of the array: ");
        arrayOFTheNumbers = new int[scan.nextInt()];
        for (int i = 0; i < arrayOFTheNumbers.length; i++) {
            System.out.print("Input value " + i + " element: ");
            arrayOFTheNumbers[i] = scan.nextInt();
        }
        for (int i = 0; i < arrayOFTheNumbers.length; i++)
            System.out.println(arrayOFTheNumbers[i]);


    }
}
