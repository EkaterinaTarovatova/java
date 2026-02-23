package com.lesson.two.sweets;

public interface SweetBox {
    void add(Sweet sweet);
    void deleteByIndex(int index);
    void deleteLast();
    void showWeight();
    void showPrice();
    void showAllSweetsInfo();
    void optimizeByWeight(double maxWeight);
    void optimizeByPrice(double maxWeight);
}
