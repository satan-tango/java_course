package com.javacourse.lessons.les_15.homework.task_1;

public abstract class Vegetable {

    private double weight;
    //If you use enum TypeOfVegetable then all of the specific Vegetable instances are redundant, actually... As they do not
    //have any logic behind
    private TypeOfVegetable typeOfVegetable;
    public static final int PROTEIN_INDEX = 5;
    public static final int FAT_INDEX = 9;
    public static final int CARBOHYDRATE_INDEX = 4;

    public Vegetable(double weight, TypeOfVegetable typeOfVegetable) {
        this.weight = weight;
        this.typeOfVegetable = typeOfVegetable;
    }

    public int CalculateTheCalorie() {
        double result = 0;
        result = typeOfVegetable.getProteins() * PROTEIN_INDEX + typeOfVegetable.getFats() * FAT_INDEX
                + typeOfVegetable.getCarbohydrates() * CARBOHYDRATE_INDEX;
        return (int) (result * weight / 100);
    }

    public double getWeight() {
        return weight;
    }

    public TypeOfVegetable getTypeOfVegetable() {
        return typeOfVegetable;
    }
}
