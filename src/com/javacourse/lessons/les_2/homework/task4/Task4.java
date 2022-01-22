package com.javacourse.lessons.les_2.homework.task4;

// Бегун пробежал в первый день 10км, каждый последующий день увеличовал расстояние на 10%, сколько пробежал бегну
// за 7 дней.
//+'
public class Task4 {
    public static void main(String[] args) {
        double finalDistance = 10;
        //6 - const
        for (int i = 0; i <6 ; i++) {
            //0.1 - const
            finalDistance +=finalDistance*0.1;
        }
        System.out.printf("Final distance which runner has been run: %.2f km",finalDistance);
    }
}
