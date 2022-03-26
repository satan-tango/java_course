package com.javacourse.lessons.les_15.homework.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Salad {

    private List<Vegetable> listOfVegetables;
    private Scanner scan;

    public Salad() {
        listOfVegetables = new ArrayList();
        scan = new Scanner(System.in);
    }

    public void addVegetable(Vegetable vegetable) {
        listOfVegetables.add(vegetable);
    }

    public void vegetablesInCalorieRange() {
        int calorieRange = 0;
        System.out.println("Vegetables in set range");
        System.out.print("Input calorie range: ");
        calorieRange = scan.nextInt();
        System.out.println();
        boolean hasVegetablesInRange = false;

        for (Vegetable vegetable : listOfVegetables) {
            if (calorieRange >= vegetable.CalculateTheCalorie()) {
                hasVegetablesInRange = true;
                System.out.println(vegetable.getTypeOfVegetable().name() + ":");
                System.out.println("Weight - " + vegetable.getWeight() + " grams");
                System.out.println("Proteins - " + vegetable.getTypeOfVegetable().getProteins());
                System.out.println("Fats - " + vegetable.getTypeOfVegetable().getFats());
                System.out.println("Carbohydrates - " + vegetable.getTypeOfVegetable().getCarbohydrates());
                System.out.println("Calories - " + vegetable.CalculateTheCalorie());
                System.out.println();
            }
        }
        if (!hasVegetablesInRange) {
            System.out.println("There are no vegetables in set range");
        }
        System.out.println("-------------------------------------------\n");
    }

    public void vegetablesInSalad() {
        System.out.println("Vegetables in salad: ");
        for (Vegetable vegetable : listOfVegetables) {
            System.out.println(vegetable.getTypeOfVegetable().name().toLowerCase(Locale.ROOT) + " - " + vegetable.getWeight() + " grams");
        }
        System.out.println("-------------------------------------------\n");
    }

    public void saladWeight() {
        double weight = 0;
        System.out.print("Salad wight in grams: ");
        for (Vegetable vegetable : listOfVegetables) {
            weight += vegetable.getWeight();
        }
        System.out.println(weight);
    }
}
