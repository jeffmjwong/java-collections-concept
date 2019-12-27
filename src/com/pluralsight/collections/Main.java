package com.pluralsight.collections;

public class Main {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        System.out.println(door);
        System.out.println(floorPanel);
        System.out.println(window);
    }
}
