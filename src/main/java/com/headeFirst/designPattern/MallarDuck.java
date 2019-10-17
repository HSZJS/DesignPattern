package com.headeFirst.designPattern;

public  class MallarDuck extends Duck{
    public MallarDuck(){
        flyBehavior = new FlyBehaviorMallarDuck();
    }

    public void display(){
        System.out.println("mallar Duck display");
    }
}
