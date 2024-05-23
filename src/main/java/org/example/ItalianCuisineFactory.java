package org.example;

import java.util.Arrays;

public class ItalianCuisineFactory implements IMealFactory {
    @Override
    public IMainCourse createMainCourse() {
        return new Pizza(Arrays.asList("Tomato Sauce", "Pepperoni", "Pineapple", "Cheese"));
    }

    @Override
    public IDessert createDessert() {
        return new Tiramisu();
    }
}