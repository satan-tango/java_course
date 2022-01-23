package com.javacourse.lessons.les_3.homework.task5;

// Решить квадратное уравнения ax2 + bx + c
// a = 1, b = 5, c = 3

public class Task5 {
    public static void main(String[] args) {
        final int a = 1, b = 5, c = 3;
        double D = 0;
        double x1, x2 = 0;
        System.out.println("Solve the quadratic equation ax^2 + bx + c ");
        System.out.println("where a = 1, b = 5, c = 3");
        D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.printf("x1 = %.2f\nx2 = %.2f",x1,x2);
        } else if (D == 0) {
            x1 = -b * 2 * a;
            System.out.printf("x = %.2f\n",x1);
        } else {
            System.out.println("There's no solution");
        }
    }
}
