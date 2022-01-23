package com.javacourse.lessons.les_3.homework.task1;

//Вычислить 1+2+4+8...+256

public class Task1 {
    public static void main(String[] args) {
        final int LAST_NUMBER = 256;
        int sumResult = 0;
        for (int i = 1; i <=LAST_NUMBER ; i*=2) {
            sumResult+=i;
        }
        System.out.print("Result is "+ sumResult);
    }
}
