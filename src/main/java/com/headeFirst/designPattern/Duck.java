package com.headeFirst.designPattern;
/**
 * create by jasonhe_heshuzhan
 * time: 2019-10-18
 * */
public abstract class Duck {
    public Duck(){

    }
    //FlyBehavior
    FlyBehavior flyBehavior;
    //quack
    public void quack(){System.out.println("duck...");}
    //swim
    public void swim(){ System.out.println("display..."); }
    //display
    public abstract void display();
    //fly
    public void performFly(){
        flyBehavior.fly();
    }

}
