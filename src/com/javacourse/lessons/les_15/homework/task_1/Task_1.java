package com.javacourse.lessons.les_15.homework.task_1;

public class Task_1 {

    public static void main(String[] args) {

        Salad vegetableSalad = new Salad();
        vegetableSalad.addVegetable(new Tomato(100, TypeOfVegetable.TOMATO));
        vegetableSalad.addVegetable(new Carrot(45, TypeOfVegetable.CARROT));
        vegetableSalad.addVegetable(new Cabbage(125, TypeOfVegetable.CABBAGE));
        vegetableSalad.addVegetable(new Radish(10, TypeOfVegetable.RADISH));

        vegetableSalad.vegetablesInSalad();
        vegetableSalad.vegetablesInCalorieRange();
        vegetableSalad.saladWeight();
    }
}
