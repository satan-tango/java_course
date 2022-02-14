package com.javacourse.lessons.les_7.homework.task_8;
//belicimo! But also there is a solution, which do not require so many loops
public class Task_8 {

    public static void main(String[] args) {
        //Вывести бабочку

        final int wingWidth = 5;
        final int wingHeight = wingWidth * 2;
        int[][] butterflyWing = new int[wingHeight][];
        fillButterfly(butterflyWing, wingHeight, wingWidth);
        inputButterfly(butterflyWing, wingHeight, wingWidth);
    }

    public static void fillButterfly(int[][] array, int height, int width) {
        int elementsInRow = 1;
        boolean isTop = true;
        for (int i = 0; i < height; i++) {
            array[i] = new int[elementsInRow];
            for (int j = 0; j < elementsInRow; j++) {
                array[i][j] = j + 1;
            }
            if (elementsInRow == width) {
                isTop = false;
            }
            if (isTop) {
                elementsInRow++;
            } else {
                elementsInRow--;
            }
        }
    }

    public static void addSpaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public static void inputButterfly(int[][] array, int height, int width) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            addSpaces((width - array[i].length) * 2);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][array[i].length - j - 1]);
            }
            System.out.println();
        }
    }

}
