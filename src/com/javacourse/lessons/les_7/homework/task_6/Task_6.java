package com.javacourse.lessons.les_7.homework.task_6;

public class Task_6 {

    public static void main(String[] args) {
    //Посчитать сумму элементов расположенных на главной диагонали

        final int TOP_RANGE = 3;
        final int BOT_RANGE = 1;
        final int ROWS = 5;
        final int COLS = 5;
        int[][] arrayOfNumber = new int[ROWS][COLS];
        initArray(arrayOfNumber, TOP_RANGE, BOT_RANGE);
        outputArray(arrayOfNumber);
        mainDiagonal(arrayOfNumber);
    }

    public static void initArray(int[][] arrayOfNumber, int max, int min) {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                arrayOfNumber[i][j] = randomNumber(max, min);
            }
        }
    }

    public static void outputArray(int[][] arrayOfNumber) {
        for (int[] arr : arrayOfNumber) {
            for (int numb : arr) {
                System.out.print(numb + "\t");
            }
            System.out.println();
        }
    }

    public static void mainDiagonal(int[][] arrayOfNumber) {
        int mainDiagonalSum = 0;
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                if (i == 0) {
                    mainDiagonalSum += arrayOfNumber[i][j];
                    break;
                } else {
                    if (j == 0) {
                        continue;
                    } else {
                        mainDiagonalSum += arrayOfNumber[i][j * i];
                        break;
                    }
                }
            }
        }
        System.out.println("\nMain diagonal sum is " + mainDiagonalSum);
    }


    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
