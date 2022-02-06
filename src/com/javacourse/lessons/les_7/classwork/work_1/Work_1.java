package com.javacourse.lessons.les_7.classwork.work_1;

import java.util.Scanner;

public class Work_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Entire length of the array: ");
        String[] arrayOfWord = new String[scan.nextInt()];
        for (int i = 0; i <arrayOfWord.length ; i++) {
            System.out.println("Entire value of the "+i+" element: ");
            arrayOfWord[i] = scan.next();
        }


        for (String str:arrayOfWord) {
            System.out.print(str + " ");
        }
    }
}
