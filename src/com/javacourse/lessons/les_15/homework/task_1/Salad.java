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
        //not a good idea to depend on scanner in this class. What if i will init values from file? Make code less tied
        scan = new Scanner(System.in);
    }

    public void addVegetable(Vegetable vegetable) {
        listOfVegetables.add(vegetable);
    }
//where is range? Pass it in params. Your method has a lot of responsibilities. 
//return this Vegetables as a List or Array (preferrable as it is our topic).
//printing is redundant here.
    public void vegetablesInCalorieRange() {
        int calorieRange = 0;
        System.out.println("Vegetables in set range");
        System.out.print("Input calorie range: ");
        calorieRange = scan.nextInt();
        System.out.println();
        boolean hasVegetablesInRange = false;

        for (Vegetable vegetable : listOfVegetables) {
            if (calorieRange <= vegetable.CalculateTheCalorie()) {
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
//getVegetablesInSalad
//void->array or List
    public void vegetablesInSalad() {
        System.out.println("Vegetables in salad: ");
        for (Vegetable vegetable : listOfVegetables) {
            System.out.println(vegetable.getTypeOfVegetable().name().toLowerCase(Locale.ROOT) + " - " + vegetable.getWeight() + " grams");
        }
        System.out.println("-------------------------------------------\n");
    }
//getSaladWeight | calculateSaladWeight
 // void->double
    public void saladWeight() {
        double weight = 0;
        //does your method say anything about printing? What if I will need this value in some calculations? How will I get it?
        System.out.print("Salad wight in grams: ");
        for (Vegetable vegetable : listOfVegetables) {
            weight += vegetable.getWeight();
        }
        //bad
        System.out.println(weight);
    }
}
