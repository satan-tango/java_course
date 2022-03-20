package com.javacourse.lessons.les_14.homework.task_1;
//+
public class Task_1 {

    public static void main(String[] args) {
        //Есть городская многоэтажка и загородный дом. У каждого тип есть методы
        //Реальзовать каталог, добавить туда несколько типов дамов

        Catalog catalog = new Catalog();
        catalog.addBuilding(new CountryHouse(2, true, 4));
        catalog.addBuilding(new CountryHouse(1, false, 2));
        catalog.addBuilding(new HighRiseBuilding(12, true, 125));
        catalog.addBuilding(new HighRiseBuilding(20, true, 400));
        catalog.addBuilding(new CountryHouse(1, false, 1));
        catalog.outputDate();
    }
}
