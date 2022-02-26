package com.javacourse.lessons.les_9.homework.div_arr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2, 5};
        DivArray divArray = new DivArray(array.length);
        divArray = createTwoArray(array);
        System.out.println(Arrays.toString(divArray.array1));
        System.out.println(Arrays.toString(divArray.array2));
    }

    static DivArray createTwoArray(int[] array) {
        DivArray divArray;
        if (array.length % 2 == 0) {
            divArray = new DivArray(array.length);
            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {
                    divArray.array1[i] = array[i];
                }
                if (i >= array.length / 2)
                    divArray.array2[i - array.length / 2] = array[i];
            }
        } else {
            divArray = new DivArray(array.length);
            for (int i = 0; i < array.length; i++) {
                if (i <= array.length / 2) {
                    divArray.array1[i] = array[i];
                }
                if (i > array.length / 2)
                    divArray.array2[i - array.length / 2 - 1] = array[i];
            }

        }
        return divArray;
    }
}
