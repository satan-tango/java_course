package com.javacourse.lessons.les_18.classwork.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_4 {

    public static void main(String[] args) {

        List<String> listOfInt = initList();
        listOfInt = deleteSameElements(listOfInt);
        System.out.println(listOfInt);
    }

    public static List<String> initList() {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("No");
        list.add("Hello");
        list.add("Harry");
        list.add("No");
        list.add("Harry");
        list.add("Avada-kedavra");
        list.add("Yes");
        return list;
    }

    public static List<String> deleteSameElements(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}
