package com.headeFirst.designPattern.ObserverPattern;

public class StatistionDisplay implements Observer,DisplayElement {
    public void update(float temp,float humidity,float pressure){
        System.out.println("CurrentConditionsUpdate");
    }
    //display mix value and min value
    public void display(){
        System.out.println("mixValueAndminValue");
    }
}
