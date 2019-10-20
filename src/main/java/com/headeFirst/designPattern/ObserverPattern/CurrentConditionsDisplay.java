package com.headeFirst.designPattern.ObserverPattern;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    public void update(){
        System.out.println("CurrentConditionsUpdate");
    }
    //display currency weater value
    public void display(){
        System.out.println("CurrentConditionsDisplay");
    }
}
