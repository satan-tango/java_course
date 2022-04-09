package com.javacourse.lessons.les_16.homework.task_2.option_1;



import java.util.Set;
import java.util.TreeSet;

public class Task_2 {

    public static void main(String[] args) {
        //Есть TreeSet нужно отсортировать его в обратном порядке

        Set<Numb> numbersSet = initSet();
        outputSet(numbersSet);
    }

    public static Set<Numb> initSet() {
        Set<Numb> set = new TreeSet<>();
        set.add(new Numb(9));
        set.add(new Numb(10));
        set.add(new Numb(3));
        set.add(new Numb(124));
        set.add(new Numb(1));
        set.add(new Numb(14242));
        return set;
    }

    public static void outputSet(Set<Numb> set) {
        for (Numb number : set) {
            System.out.println(number.getNumber());
        }
    }
}
