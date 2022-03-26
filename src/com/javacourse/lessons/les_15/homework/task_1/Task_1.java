package com.javacourse.lessons.les_15.homework.task_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Salad vegetableSalad = new Salad();
        List<Vegetable> listOfVegetable;
        List<Vegetable> vegetableInCalorieRange;
        double saladWeight = 0;
        int calorieRange = 0;

        vegetableSalad.addVegetable(new Tomato(100, TypeOfVegetable.TOMATO));
        vegetableSalad.addVegetable(new Carrot(45, TypeOfVegetable.CARROT));
        vegetableSalad.addVegetable(new Cabbage(125, TypeOfVegetable.CABBAGE));
        vegetableSalad.addVegetable(new Radish(10, TypeOfVegetable.RADISH));

        listOfVegetable = vegetableSalad.getVegetablesInSalad();
        System.out.println("Vegetables that the salad contains: ");
        outputListOfVegetables(listOfVegetable);

        System.out.println("Vegetables in set range");
        System.out.print("Input calorie range: ");
        calorieRange = scan.nextInt();
        vegetableInCalorieRange = vegetableSalad.vegetablesInCalorieRange(calorieRange);
        outputListOfVegetablesWithCalories(vegetableInCalorieRange);

        saladWeight = vegetableSalad.getSaladWeight();
        System.out.print("Salad wight in grams: " + saladWeight);
    }

    public static void outputListOfVegetables(List<Vegetable> vegetables) {
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable.getTypeOfVegetable().name().toLowerCase() + " - " + vegetable.getWeight() + " grams");
        }
        System.out.println("----------------------------------------");
    }

    public static void outputListOfVegetablesWithCalories(List<Vegetable> vegetables) {
        System.out.println();
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable.getTypeOfVegetable().name() + ":");
            System.out.println("Weight - " + vegetable.getWeight() + " grams");
            System.out.println("Proteins - " + vegetable.getTypeOfVegetable().getProteins());
            System.out.println("Fats - " + vegetable.getTypeOfVegetable().getFats());
            System.out.println("Carbohydrates - " + vegetable.getTypeOfVegetable().getCarbohydrates());
            System.out.println("Calories - " + vegetable.CalculateTheCalorie());
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

}
