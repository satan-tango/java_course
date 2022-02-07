package com.javacourse.lessons.les_7.homework.task_7;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        //Создать jugged array с помощью пользоваетля и сканера.

        //Я создал обычнй массив String из 1000 элементов и заносил все введные значение в этот
        //массив, строки разделил "|". Потом перенес значение в матрицу, получилось не очень читаемо:)

        final int MAX_LENGTH = 1000;
        final int ROWS;
        String[] defArray = new String[MAX_LENGTH];
        Data data = new Data();

        data = initDefArray(defArray);
        int[][] jugArray = new int[data.getAmountOfRows()][];

        initJugArray(defArray, jugArray, data);
        outputArray(jugArray);
    }

    public static Data initDefArray(String[] array) {
        int counter = 0;
        boolean isExit = false;
        int amountOfRows = 1;
        int operationChoice = 5;
        Data value = new Data();
        Scanner scan = new Scanner(System.in);
        System.out.println("Initializing a matrix(max amount of numbers is " + array.length + ")");
        while (counter < array.length && !isExit) {
            System.out.print("\nEntry a number in "+ amountOfRows+ " row: ");
            array[counter] = scan.next();
            System.out.println();
            while (operationChoice < 1 || operationChoice > 3) {
                System.out.println("1 - One more number in this row");
                System.out.println("2 - Next row");
                System.out.println("3 - Exit");
                System.out.print("Chose an operation: ");
                operationChoice = scan.nextInt();
            }
            if (operationChoice == 1) {
                counter++;
                operationChoice = 5;
            } else if (operationChoice == 2) {
                operationChoice = 5;
                counter++;
                array[counter] = "|";
                counter++;
                amountOfRows++;
            } else {
                isExit = true;
            }
        }
        value.setAmountOfElements(counter + 1);
        value.setAmountOfRows(amountOfRows);
        return value;
    }

    public static void initJugArray(String[] defArray, int[][] jugArray, Data data) {
        int rowCounter = 0;
        int colCounter = 0;
        int index = 0;
        int arrayIndex;
        while (rowCounter < data.getAmountOfRows()) {
            colCounter = countAmountElemInRow(defArray, index, data.getAmountOfElements());
            jugArray[rowCounter] = new int[colCounter];
            colCounter += index;
            arrayIndex = 0;
            for (int i = index; i < colCounter; i++) {
                jugArray[rowCounter][arrayIndex] = Integer.parseInt(defArray[i]);
                arrayIndex++;
            }
            rowCounter++;
            index = colCounter + 1;
        }
    }

    public static int countAmountElemInRow(String[] defArray, int index, int elements) {
        int counter = 0;
        while (defArray[index] != "|" && index < elements) {
            index++;
            counter++;
        }
        return counter;
    }

    public static void outputArray(int[][] array) {
        System.out.println("\nMatrix:");
        for (int[] ar : array) {
            for (int number : ar) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
