/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverages;

import hf_dp_ch3_decoratorpattern.Beverage;
import hf_dp_ch3_decoratorpattern.CondimentDecorator;

/**
 *
 * @author Tolga
 * 
 * Decorator
 * Yan İçecek
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
    
}
