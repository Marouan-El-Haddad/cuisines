package org.example;

public class ChickenCurry implements IMainCourse {
    private int spiciness;

    public ChickenCurry(int spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public void consume() {
        System.out.println("Eating chicken curry with spiciness level: " + spiciness);
    }
}