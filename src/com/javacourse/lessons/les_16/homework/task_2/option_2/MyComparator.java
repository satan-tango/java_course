package com.javacourse.lessons.les_16.homework.task_2.option_2;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer firstNumber, Integer secondNumber) {
        if (firstNumber - secondNumber != 0) {
            return -(firstNumber - secondNumber);
        }
        return 0;
    }
}
