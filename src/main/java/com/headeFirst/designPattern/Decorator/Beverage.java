package com.headeFirst.designPattern.Decorator;
/**
 * component
 * */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract double cost();
}
