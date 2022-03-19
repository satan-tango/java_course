package com.javacourse.lessons.les_13.homework.task_2;

public class Task_2 {

    public static void main(String[] args) {
        //Создать зоопарк

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Oleg"));
        zoo.addAnimal(new Cat("Dima"));
        zoo.addAnimal(new Monkey("Matroskin"));
        zoo.soundOff();
    }
}
