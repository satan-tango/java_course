package com.javacourse.lessons.les_15.homework.task_1;

public abstract class Vegetable {

    private double weight;
    //If you use enum TypeOfVegetable then all of the specific Vegetable instances are redundant, actually... As they do not
    //have any logic behind
    private TypeOfVegetable typeOfVegetable;

    public Vegetable(double weight, TypeOfVegetable typeOfVegetable) {
        this.weight = weight;
        this.typeOfVegetable = typeOfVegetable;
    }

    public int CalculateTheCalorie() {
        double result = 0;
        //5->const, 9->const, 4->const
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
