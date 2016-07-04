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
public class GeneralConditionDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public GeneralConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity    = weatherData.getHumidity();
            this.pressure    = weatherData.getPressure();
        
            display();
        }
    }

    public void display() {
        System.out.println("Temperature : " + temperature + " ,Humidity : " + humidity + " ,Pressure : " + pressure);
    }
 
}
