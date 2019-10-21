package com.headeFirst.designPattern.Decorator;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend coffee";
    }
    public double cost(){
        return .89;
    }
}
