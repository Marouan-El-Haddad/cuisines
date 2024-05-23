package org.example;

public class Main {
    public static void main(String[] args) {
        // Test Italian cuisine
        IMealFactory italianFactory = new ItalianCuisineFactory();
        IMainCourse italianMain = italianFactory.createMainCourse();
        IDessert italianDessert = italianFactory.createDessert();

        italianMain.consume();
        italianDessert.enjoy();

        // Test Indian cuisine
        IMealFactory indianFactory = new IndianCuisineFactory();
        IMainCourse indianMain = indianFactory.createMainCourse();
        IDessert indianDessert = indianFactory.createDessert();

        indianMain.consume();
        indianDessert.enjoy();
    }
}