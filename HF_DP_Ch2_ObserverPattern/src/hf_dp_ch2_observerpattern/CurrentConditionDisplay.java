/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch2_observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Tolga
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable /*Subject weatherData */) {
        this.observable = observable;
        observable.addObserver(this);
        /* this.weatherData = weatherData;
        weatherData.registerObserver(this); */
    }
    
    public void update(Observable obs, Object arg/* float temperature, float humidity, float pressure */) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
        
        display();
    }

    @Override
    public void display() {
        System.out.println("Temp : " + temperature + " Hum : " + humidity);
    }
    
}
