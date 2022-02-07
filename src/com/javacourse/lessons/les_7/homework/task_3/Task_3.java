package com.javacourse.lessons.les_7.homework.task_3;

public class Task_3 {

    public static void main(String[] args) {
        //Вывести таблицу умножения

        String[][] multiplicationGreed = new String[11][11];
        for (int i = 0; i < multiplicationGreed.length; i++) {
            for (int j = 0; j < multiplicationGreed[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        multiplicationGreed[i][j] = "☨";
                    } else {
                        multiplicationGreed[i][j] = Integer.toString(j);
                    }
                } else {
                    if (j == 0) {
                        multiplicationGreed[i][j] = Integer.toString(i);
                    } else {
                        multiplicationGreed[i][j] = Integer.toString(j * i);
                    }
                }
            }
        }
        for (String[] arr : multiplicationGreed) {
            for (String elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
