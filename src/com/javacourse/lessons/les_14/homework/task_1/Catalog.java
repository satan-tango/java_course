package com.javacourse.lessons.les_14.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Building> listOfBuilding;

    public Catalog() {
        listOfBuilding = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        listOfBuilding.add(building);
    }

    public void outputDate() {
        for (Building building : listOfBuilding) {
            System.out.println(outputClassName(building.getClass()));
            System.out.println("Amount of floor: " + building.amountOfFloor);
            System.out.println("Amount of residents: " + building.amountOfResidents);
            building.heatingStatus();
            System.out.println("____________________________________________");
        }
    }

    public String outputClassName(Class name) {
        String className = name + "";
        if (className.matches(".*(\\.CountryHouse)$")) {
            return "CountryHouse";
        } else {
            return "HighRiseBuilding";
        }
    }
}
