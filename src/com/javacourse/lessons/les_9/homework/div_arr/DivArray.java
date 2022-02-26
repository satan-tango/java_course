package com.javacourse.lessons.les_9.homework.div_arr;

public class DivArray {
    public int[] array1;
    public int[] array2;

    public DivArray(int length) {
        if (length % 2 == 0) {
            array1 = new int[length / 2];
            array2 = new int[length / 2];
        } else {
            array1 = new int[length / 2 + 1];
            array2 = new int[length / 2];
        }
    }
}
