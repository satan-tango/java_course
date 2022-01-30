package com.javacourse.lessons.les_4.classwork.work_1;

import java.util.Scanner;

public class Work_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputLine = scan.next();
        char symbol;
        for (int i = 0; i < inputLine.length() / 2; i++) {
            symbol = inputLine.charAt(i);
            System.out.println(symbol);
            inputLine = inputLine.replaceFirst(String.valueOf(inputLine.charAt(i)) , String.valueOf(inputLine.length() -i));
            System.out.println(inputLine);
            inputLine = inputLine.replaceFirst(String.valueOf(symbol),String.valueOf(inputLine.length() - i));
            System.out.println(inputLine);
        }
        System.out.println(inputLine);

//        for (int i = 0; i <inputLine.length() ; i++) {
//            System.out.print(inputLine.charAt(inputLine.length()-i-1));
//        }

    }
}
