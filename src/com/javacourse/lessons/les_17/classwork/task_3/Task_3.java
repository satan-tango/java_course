package com.javacourse.lessons.les_17.classwork.task_3;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {

    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();

        int index = 1;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                myMap.put(index, i);
                index++;
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            result += entry.getValue();
        }
        System.out.println(result);
    }
}
