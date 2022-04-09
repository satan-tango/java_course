package com.javacourse.lessons.les_18.classwork.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {

        List<String> listOfString = initList();
        List<String> sortedArray = sortList(listOfString);
        System.out.println(sortedArray);
    }

    public static List<String> initList() {
        List<String> list = new ArrayList<>();
        list.add("bjg");
        list.add("a");
        list.add("jije");
        list.add("ereqq");
        list.add("cccccccccccccccccccccc");
        list.add("we");
        return list;
    }

    public static List<String> sortList(List<String> list) {
        List<String> sortedArray = new ArrayList<>();
        Collections.copy(sortedArray, list);
        String temp = "";
        for (int i = 0; i < sortedArray.size(); i++) {
            for (int j = i; j < sortedArray.size() - 1 - i; j++) {
                if (compareSymbol(sortedArray.get(j).charAt(0), sortedArray.get(j + 1).charAt(0))) {
                    temp = sortedArray.get(j);
                    sortedArray.set(j, sortedArray.get(j + 1));
                    sortedArray.set(j + 1, temp);
                }
            }
        }
        return sortedArray;
    }

    public static boolean compareSymbol(char a, char b) {
        if (a >= b) {
            return true;
        }
        return false;
    }
}
