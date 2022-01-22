package com.javacourse.lessons.les_2.classwork.work1;

public class Work_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    for (int k = 0; k <= j; k++) {
                        System.out.print("*");
                    }
                }else {
                    for (int k = 3; k >= j; k--) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }
}
