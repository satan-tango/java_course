package com.javacourse.lessons.les_2.homework.task1;

//Амеба делится каждые два три часа на 2, оперделить количесвто амеб через 3, 6... 24 часов.

public class Task1 {

    public static void main(String[] args) {
        int amountOfAmoebas = 1;
            for (int k = 3; k <=24 ; k+=3) {
                amountOfAmoebas = amountOfAmoebas*2;
                System.out.println("Amoebas after " + k + " hour: " + amountOfAmoebas);
            }

    }
}
