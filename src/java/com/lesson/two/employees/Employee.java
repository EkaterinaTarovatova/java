package com.lesson.two.employees;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private Position position;
    private String personalSkills;

    public Employee(String name, String surname, int age, Position position, String personalSkills) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.personalSkills = personalSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getPersonalSkills() {
        return personalSkills;
    }

    public void setPersonalSkills(String personalSkills) {
        this.personalSkills = personalSkills;
    }

    @Override
    public String toString() {
        return getName() + " "
                + getSurname() + ", "
                + getAge() + " лет, "
                + getPosition().getPositionName()
                + ", " + getPersonalSkills();
    }
}