package com.lesson.two.sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GiftBox implements SweetBox {
    private final List<Sweet> sweets;

    public GiftBox() {
        this.sweets = new ArrayList<>();
    }

    @Override
    public void add(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void deleteByIndex(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    @Override
    public void deleteLast() {
        if (!sweets.isEmpty()) {
            sweets.removeLast();
        }
    }

    @Override
    public void showWeight() {
        System.out.println("Общий вес подарка: " + calculateTotalWeight());
    }

    @Override
    public void showPrice() {
        System.out.println("Общая стоимость подарка: " + calculateTotalPrice());
    }

    @Override
    public void showAllSweetsInfo() {
        if (sweets.isEmpty()) {
            System.out.println("Коробка пуста");
            return;
        }

        System.out.println("Сладости в коробке:");
        for (int i = 0; i < sweets.size(); i++) {
            Sweet sweet = sweets.get(i);
            System.out.println((i + 1) + ". " + sweet);
        }
    }

    @Override
    public void optimizeByWeight(double maxWeight) {
        sweets.sort(Comparator.comparingDouble(Sweet::getWeight));

        double currentWeight = calculateTotalWeight();
        while (currentWeight >= maxWeight && !sweets.isEmpty()) {
            sweets.removeFirst();
            currentWeight = calculateTotalWeight();
        }
    }

    @Override
    public void optimizeByPrice(double maxWeight) {
        sweets.sort(Comparator.comparingDouble(Sweet::getPrice));

        double currentWeight = calculateTotalWeight();
        while (currentWeight >= maxWeight && !sweets.isEmpty()) {
            sweets.removeFirst();
            currentWeight = calculateTotalWeight();
        }
    }

    private double calculateTotalWeight() {
        double total = 0;
        for (Sweet sweet : sweets) {
            total += sweet.getWeight();
        }
        return total;
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Sweet sweet : sweets) {
            total += sweet.getPrice();
        }
        return total;
    }
}
