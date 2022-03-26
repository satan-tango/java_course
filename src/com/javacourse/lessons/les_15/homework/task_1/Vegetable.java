package com.javacourse.lessons.les_15.homework.task_1;

public abstract class Vegetable {

    private double weight;
    private TypeOfVegetable typeOfVegetable;

    public Vegetable(double weight, TypeOfVegetable typeOfVegetable) {
        this.weight = weight;
        this.typeOfVegetable = typeOfVegetable;
    }

    public int CalculateTheCalorie() {
        double result = 0;
        result = typeOfVegetable.getProteins() * 5 + typeOfVegetable.getFats() * 9 + typeOfVegetable.getCarbohydrates() * 4;
        return (int) (result * weight / 100);
    }

    public double getWeight() {
        return weight;
    }

    public TypeOfVegetable getTypeOfVegetable() {
        return typeOfVegetable;
    }
}
