package com.javacourse.lessons.les_16.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class PartyList {
    private List<String> nameList;

    public PartyList() {
        nameList = new ArrayList<>();
    }

    public void addName(String name) {
        nameList.add(name);
    }

    public List<String> getNameList() {
        return nameList;
    }
}
