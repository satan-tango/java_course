package com.javacourse.lessons.les_14.homework.task_1;

public abstract class Building {
    int amountOfFloor;
    boolean heating;
    int amountOfResidents;

    public Building(int amountOfFloor, boolean heating, int amountOfResidents) {
        this.amountOfFloor = amountOfFloor;
        this.heating = heating;
        this.amountOfResidents = amountOfResidents;
    }

    public void turnHeating() {
        heating = true;
    }

    public void turnOffHeating() {
        heating = false;
    }

    public void heatingStatus() {
        if (heating) {
            System.out.println("Heating is turn on");
        }else {
            System.out.println("Heating is turn off");
        }
    }

    public int getAmountOfFloor() {
        return amountOfFloor;
    }

    public int getAmountOfResidents() {
        return amountOfResidents;
    }
}
