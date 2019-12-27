package com.pluralsight.collections;

public class Product {
    private String name;
    private int weight;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
