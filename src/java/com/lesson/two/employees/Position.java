package com.lesson.two.employees;

public abstract class Position {
    protected abstract String getPositionName();

    protected abstract int getBreakTimeInMinutes();

    public void showDailySchedule() {
        System.out.println("Распорядок дня:");
        System.out.println("- Пришел на работу");
        System.out.println("- Выполнял должностные обязанности");
        System.out.println("- Обедал " + this.getBreakTimeInMinutes() + " минут");
        System.out.println("- Выполнял должностные обязанности");
        System.out.println("- Ушел домой");
    }
}
