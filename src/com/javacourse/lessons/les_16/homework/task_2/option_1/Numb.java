package com.javacourse.lessons.les_16.homework.task_2.option_1;

import java.util.Objects;

public class Numb implements Comparable<Numb> {
    private Integer number;

    public Numb(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numb numb = (Numb) o;
        return Objects.equals(number, numb.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(Numb otherNumber) {
        return -(number - otherNumber.getNumber());
    }
}
