package com.lesson.two.sweets;

public class Chocolate extends Sweet {
    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(double cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    private double cocoaPercentage;

    public Chocolate(String name, double weight, double price, double cocoaPercentage) {
        super(name, weight, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String getUniqueParameter() {
        return "Какао: " + getCocoaPercentage() + "%";
    }
}
