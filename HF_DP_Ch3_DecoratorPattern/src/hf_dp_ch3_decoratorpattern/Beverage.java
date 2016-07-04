/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch3_decoratorpattern;

/**
 *
 * @author Tolga
 */
public abstract class Beverage {
    public String description = "Unknown Description";

    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
