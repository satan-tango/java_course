package com.javacourse.lessons.les_7.homework.task_5;

import java.awt.font.FontRenderContext;

public class Task_5 {

    public static void main(String[] args) {
        //Посчитать сумму элементов в строке

        final int TOP_RANGE = 300;
        final int BOT_RANGE = 100;
        final int ROWS = 5;
        final int COLS = 5;
        int[][] arrayOfNumber = new int[ROWS][COLS];
        initArray(arrayOfNumber, TOP_RANGE, BOT_RANGE);
        outputArrayWithSum(arrayOfNumber);
    }

    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void initArray(int[][] arrayOfNumber, int max, int min) {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                arrayOfNumber[i][j] = randomNumber(max, min);
            }
        }
    }

    public static void outputArrayWithSum(int[][] arrayOfNumber) {
        int rowSum;
        for (int i = 0; i < arrayOfNumber.length; i++) {
            rowSum = 0;
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                rowSum += arrayOfNumber[i][j];
                System.out.print(arrayOfNumber[i][j] + "\t");
                if (j == arrayOfNumber[i].length - 1) {
                    System.out.print("Sum: "+rowSum);
                }
            }
            System.out.println();
        }
    }

}
