package com.javacourse.lessons.les_2.homework.task3;

//Перевод из дюймов в сантиметры.
//+'
public class Task3 {
    public static void main(String[] args) {
        System.out.println("inches\tcentimetres");
        //20 - magic number, use const
        for (int i = 1; i <=20 ; i++) {
            //2.54 - magic number, use const
            System.out.println(i+"\t\t"+i*2.54);
        }
    }
}
