package com.headeFirst.designPattern.Decorator;

public class HouseBlend extends Beverage {
    public Espresso(){
        description = "House Blend coffee";
    }
    public double cost(){
        return 0.89;
    }
}
