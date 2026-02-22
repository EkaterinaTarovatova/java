package com.lesson.two.employees;

public class Cleaner extends Position {
    @Override
    protected String getPositionName() {
        return "Уборщик";
    }

    @Override
    protected int getBreakTimeInMinutes() {
        return 30;
    }
}
