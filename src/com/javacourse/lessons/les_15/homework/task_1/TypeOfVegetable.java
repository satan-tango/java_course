package com.javacourse.lessons.les_15.homework.task_1;

public enum TypeOfVegetable {
    TOMATO(0.6, 0, 3.8),
    CUCUMBER(0.8, 0.1, 2.5),
    ONION(1, 0.5, 3.9),
    CABBAGE(1.8, 0.2, 4.7),
    CARROT(0.9, 0.2, 6.8),
    RADISH(1.2, 0.1, 3.4);

    private double proteins;
    private double fats;
    private double carbohydrates;

    TypeOfVegetable(double proteins, double fats, double carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }
}
