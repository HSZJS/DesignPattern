package com.headeFirst.designPattern.ObserverPattern;

public class WeatherData {
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
    }
}
