package com.javacourse.lessons.les_16.homework.task_4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_4 {

    public static void main(String[] args) {
        //Есть TreeSet имен, необходимо выбрать все имена от H до W

        final String BOT_RANGE = "H";
        final String TOP_RANGE = "W";
        Set<String> setOfName = initSetOFName();
        Set<String> namesInRange = getNamesInRange(setOfName, BOT_RANGE, TOP_RANGE);
        System.out.println(namesInRange);
    }

    public static Set<String> initSetOFName() {
        Set<String> set = new TreeSet<>();
        set.add("Harry");
        set.add("Oliver");
        set.add("Jack");
        set.add("Charlie");
        set.add("Thomas");
        set.add("Jacob");
        set.add("Alfie");
        set.add("Riley");
        set.add("William");
        set.add("James");
        set.add("Amelia");
        set.add("Olivia");
        set.add("Jessica");
        set.add("Emily");
        return set;
    }

    public static Set<String> getNamesInRange(Set<String> sourceSet, String botRange, String topRange) {
        Set<String> set = new LinkedHashSet<>();
        for (String name : sourceSet) {
            if (isNameInRange(name, botRange, topRange)) {
                set.add(name);
            }
        }
        return set;
    }

    public static boolean isNameInRange(String name, String botRange, String topRange) {
        if (name.toUpperCase().charAt(0) >= botRange.toUpperCase().charAt(0) &&
                name.toUpperCase().charAt(0) <= topRange.toUpperCase().charAt(0)) {
            return true;
        }
        return false;
    }
}
