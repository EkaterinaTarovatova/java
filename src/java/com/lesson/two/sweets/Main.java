package com.lesson.two.sweets;

public class Main {
    public static void main(String[] args) {
        SweetBox giftBox = initializeSweetBox();

        System.out.println("Исходное состояние коробки:");
        giftBox.showAllSweetsInfo();
        giftBox.showWeight();
        giftBox.showPrice();

        System.out.println("\nОптимизация по весу (макс. 200 г):");
        giftBox.optimizeByWeight(200.0);
        giftBox.showAllSweetsInfo();
        giftBox.showWeight();
        giftBox.showPrice();

        giftBox = initializeSweetBox();

        System.out.println("\nОптимизация по цене (макс. 200 р):");
        giftBox.optimizeByPrice(200.0);
        giftBox.showAllSweetsInfo();
        giftBox.showWeight();
        giftBox.showPrice();
    }

    private static SweetBox initializeSweetBox() {
        SweetBox giftBox = new GiftBox();
        giftBox.add(new Chocolate("Горький шоколад", 100.0, 150.0, 70.0));
        giftBox.add(new Candy("Мятные конфеты", 50.0, 50.0, "Мята"));
        giftBox.add(new Chocolate("Молочный шоколад", 120.0, 120.0, 50.0));
        giftBox.add(new Candy("Фруктовые конфеты", 80.0, 80.0, "Клубника"));
        return giftBox;
    }
}
