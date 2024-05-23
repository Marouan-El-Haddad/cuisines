package org.example;

public class IndianCuisineFactory implements IMealFactory {
    @Override
    public IMainCourse createMainCourse() {
        return new ChickenCurry(5);
    }

    @Override
    public IDessert createDessert() {
        return new Kheer();
    }
}