/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch2_observerpattern;

/**
 *
 * @author Tolga
 */
public class HF_DP_Ch2_ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(data);
        GeneralConditionDisplay gcd = new GeneralConditionDisplay(data);
        
        data.setMeasurement(90, 0, 30.2f);
        
        // data.deleteObserver(gcd);
        data.setMeasurement(85, 0, 30.2f);
        
        data.setMeasurement(83, 0, 30.2f);
    }
    
}
