package com.lesson.two.employees;

public class Security extends Position {
    @Override
    protected String getPositionName() {
        return "Охранник";
    }

    @Override
    protected int getBreakTimeInMinutes() {
        return 20;
    }

}
