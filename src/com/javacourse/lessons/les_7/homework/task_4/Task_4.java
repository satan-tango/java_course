package com.javacourse.lessons.les_7.homework.task_4;

import java.util.Scanner;
//well, I understand what you wanted to do, but it breaks some common classes design principles. Be patient:) Methods look good!
public class Task_4 {
    private Scanner scan;
    //actually, we do not name such variables in upper case. Usually it is done when we use 'static' with 'final'.
    private final int TOP_RANGE = 300;
    private final int BOT_RANGE = 100;
    private final int COLS = 6;
    private final int ROWS = 6;
    private int[][] arrayOfNumber;

    public static void main(String[] args) {
        new Task_4();
    }
    //Есть матрица, найти в нем введенное пользователем число, вывести строку и столбец.
//constructor with methods? Where did you that?:)
    public Task_4() {
        arrayOfNumber = new int[ROWS][COLS];
        initArray();
        outputArray();
        searchNumber();
    }

    public void initArray() {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                arrayOfNumber[i][j] = randomNumber(TOP_RANGE, BOT_RANGE);
            }
        }
    }

    public void outputArray() {
        for (int[] arr : arrayOfNumber) {
            for (int numb : arr) {
                System.out.print(numb + "\t");
            }
            System.out.println();
        }
    }


    public int randomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);//cool!
    }
//+
    public void searchNumber() {
        scan = new Scanner(System.in);
        System.out.print("\nEnter a number that need to find: ");
        int inputNumber = scan.nextInt();
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = 0; j < arrayOfNumber[i].length; j++) {
                if (arrayOfNumber[i][j] == inputNumber) {
                    System.out.println("Result: ");
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    return;
                }
            }
        }
        System.out.println("There is no number");
    }

}
