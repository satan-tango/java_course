package com.javacourse.lessons.les_7.classwork.work_2;

import java.util.Scanner;

public class Work_2 {
    public static void main(String[] args) {
        final int COLS;
        final int ROWS;
        Scanner  scan = new Scanner(System.in);
        System.out.print("Enter amount of cols: ");
        COLS = scan.nextInt();
        System.out.print("Enter amount of rows: ");
        ROWS = scan.nextInt();
        int[][] matrix = new int[COLS][ROWS];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter ("+i+","+j+") element: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int[] arr: matrix) {
            for (int numb:arr) {
                System.out.print(numb+"\t");
            }
            System.out.println();
        }
    }
}
