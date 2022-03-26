package com.javacourse.lessons.les_15.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private List<Vegetable> listOfVegetables;

    public Salad() {
        listOfVegetables = new ArrayList();
    }

    public void addVegetable(Vegetable vegetable) {
        listOfVegetables.add(vegetable);
    }


    public List<Vegetable> vegetablesInCalorieRange(int calorieRange) {
        List<Vegetable> vegetablesInRange = new ArrayList<>();
        for (Vegetable vegetable : listOfVegetables) {
            if (vegetable.CalculateTheCalorie() <= calorieRange) {
                vegetablesInRange.add(vegetable);
            }
        }
        return vegetablesInRange;
    }


    public List<Vegetable> getVegetablesInSalad() {
        return listOfVegetables;
    }


    public double getSaladWeight() {
        double weight = 0;
        for (Vegetable vegetable : listOfVegetables) {
            weight += vegetable.getWeight();
        }
        return weight;
    }
}
