package com.lesson.two.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Position cleaner = new Cleaner();
        Position driver = new Driver();
        Position manager = new Manager();
        Position security = new Security();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Пётр", "Петров", 35, cleaner, "Хорошо убирает"));
        employees.add(new Employee("Иван", "Иванов", 47, driver, "Опытный водитель"));
        employees.add(new Employee("Ирина", "Смирнова", 32, manager, "Лучший менеджер"));
        employees.add(new Employee("Алексей", "Сидоров", 50, security, "Внимательный"));

        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i+1) + ". " + employees.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВыберите сотрудника (введите номер): ");
        int choice = scanner.nextInt() - 1;

        if (choice < 0 || choice >= employees.size()) {
            System.out.println("Неверный выбор.");
            return;
        }

        Employee chosenEmployee = employees.get(choice);
        System.out.print("Сотрудник: ");
        System.out.println(chosenEmployee);
        chosenEmployee.getPosition().showDailySchedule();
    }
}
