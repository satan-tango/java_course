package com.javacourse.lessons.les_18.classwork.task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {

        List<String> listOfString = initList();
        Collections.sort(listOfString, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() >= str2.length()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
        System.out.println(listOfString);
    }


    public static List<String> initList() {
        List<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("a");
        list.add("a12");
        list.add("asdfqdwqdqwdwqd");
        list.add("asdfwqd");
        list.add("asdd");
        return list;
    }
}
