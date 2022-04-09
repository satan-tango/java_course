package com.javacourse.lessons.les_16.homework.task_2.option_2;

import com.javacourse.lessons.les_16.homework.task_2.option_1.Numb;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task_2 {

    public static void main(String[] args) {
        //Есть TreeSet нужно отсортировать его в обратном порядке

        Set<Integer> numberSet = initSetWithComparator(new MyComparator());
        System.out.println(numberSet);
    }

    public static Set<Integer> initSetWithComparator(Comparator<Integer> comparator) {
        Set<Integer> set = new TreeSet<>(comparator);
        set.add(9);
        set.add(10);
        set.add(3);
        set.add(124);
        set.add(1);
        set.add(14242);
        return set;
    }
}
