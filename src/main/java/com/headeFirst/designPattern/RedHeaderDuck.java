package com.headeFirst.designPattern;

public class RedHeaderDuck extends Duck {
    public RedHeaderDuck(){
        flyBehavior = new FlyBehaviorReadHeadDuck();
    }
    public void display(){
        System.out.println("red head duck");
    }
}
