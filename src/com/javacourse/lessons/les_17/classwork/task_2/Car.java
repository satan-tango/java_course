package com.javacourse.lessons.les_17.classwork.task_2;

public class Car {
    private int maxSpeed;
    private int weight;
    private String model;

    public Car(int maxSpeed, int weight, String model) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
