package com.javacourse.lessons.les_17.classwork.task_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            myMap.put(i, Integer.toString(9 - i + 1));
        }
        System.out.println(myMap);
    }
}
