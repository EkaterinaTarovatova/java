package com.lesson.two.employees;

public class Driver extends Position {
    @Override
    protected String getPositionName() {
        return "Водитель";
    }

    @Override
    protected int getBreakTimeInMinutes() {
        return 40;
    }
}
