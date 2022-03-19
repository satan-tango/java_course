package com.javacourse.lessons.les_13.homework.task_1;

import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) {
        //Создайте из массив из объектов класса Person,
        //Найти кол-во одинвковых объектов в массиве

        Person[] arrayOfPeople = {new Person(), new Person("Dima", 21), new Person("Dima", 21),
                new Person("Pasha", 45), new Person("Dima", 21), new Person("Pasha", 45)};
        System.out.println(Arrays.toString(arrayOfPeople) + "\n");
        equalsObjects(arrayOfPeople);
    }
//cool
    public static void equalsObjects(Person[] array) {
        int numberOfCoincidences = 0;
        int numberOfEqualsObject = 1;
        int[] arrayOfIndex = new int[array.length];
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            numberOfEqualsObject = 1;
            if (length != 0 && isContainIndex(arrayOfIndex, length, i)) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                //can't we extcract this logic as we have duplication in 25-27 lines?
                if (length != 0 && isContainIndex(arrayOfIndex, length, j)) {
                    continue;
                }
                if (array[i].equals(array[j])) {
                    arrayOfIndex[length] = j;
                    length++;
                    numberOfCoincidences++;
                    numberOfEqualsObject++;
                }
            }
            if (numberOfEqualsObject != 1) {
                System.out.println(array[i]);
                System.out.println("Amount: " + numberOfEqualsObject);
                System.out.println("___________________________________");
            }
        }
        System.out.println("Amount of coincidences: " + numberOfCoincidences);
    }

    public static boolean isContainIndex(int[] array, int arrayLength, int index) {
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == index) {
                return true;
            }
        }
        return false;
    }
}
