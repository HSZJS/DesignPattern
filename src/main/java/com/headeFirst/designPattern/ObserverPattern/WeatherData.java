package com.headeFirst.designPattern.ObserverPattern;
import java.util.ArrayList;
public class WeatherData implements Subject{
    private ArrayList observes;
    private  float temp;
    private  float humidity;
    private  float pressure;

    public void WeatherData(){
        observes = new ArrayList();
    }
    /*
    * 温度
    * */
    public void getTemperature(){
        System.out.println("temperature");
    }
    /**
     * 湿度
     * */
    public void getHumidity(){
        System.out.println("humidity");
    }
    /**
     * 气压
     * */
    public void getPressure(){
        System.out.println("pressure");
    }
    /**
     * 一旦气象测量更新，此方法会被调用
     * */
    public void measurementsChanged(){
        // add my code
        //error example
        /**
         * float temp = getTemperature();
         * float humidity = getHumidity();
         * float pressure = getPressure();
         * currentConditionsDisplay.update(temp,humidity,pressure);
         * statisticsDisplay.update(temp,humidity,pressure);
         * forecastDisplay.update(temp,humidity,pressure);
         * 1.改变的地方，需要封装起来
         * 2.针对集体的实现编程，会导致我们以后在正价或删除布告板时候必须修改程序
         * 3.至少，这里开起来像是一个统一的接口，布告板的方法名称都是update()，参数都是温度、气压、湿度
         * */
        notifyObservers();
    }
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    /**
     * 重构1-refactor
     * 1.extend subject
     * 2.implement method of subject
     * **/

    public void registerObserver(Observer o){
        observes.add(o);
        System.out.println("registerObserver");
    }
    public void removeObserver(Observer o){
        int i = observes.indexOf(o);
        if (i>=0){
            observes.remove(i);
        }
        System.out.println("removeObserver");
    }
    public void notifyObservers(){
        for(int i = 0;i<observes.size();i++){
            Observer observer = (Observer) observes.get(i);
            observer.update(temp,humidity,pressure);
        }
        System.out.println("notifyObserver");
    }

}
