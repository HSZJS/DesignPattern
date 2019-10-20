package com.headeFirst.designPattern.ObserverPattern;

public interface Subject {
    public void registerObserver();
    public void removeObserver();
    public void notifyObserver();
}
