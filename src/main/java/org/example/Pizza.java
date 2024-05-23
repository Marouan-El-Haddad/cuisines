package org.example;
import java.util.List;

public class Pizza implements IMainCourse {
    private List<String> toppings;

    public Pizza(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void consume() {
        System.out.println("Eating pizza with toppings: " + String.join(", ", toppings));
    }
}
