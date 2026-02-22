package com.lesson.two.employees;

public class Manager extends Position {

    @Override
    protected String getPositionName() {
        return "Менеджер";
    }

    @Override
    protected int getBreakTimeInMinutes() {
        return 60;
    }
}
