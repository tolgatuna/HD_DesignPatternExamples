/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverages;

import hf_dp_ch3_decoratorpattern.Beverage;

/**
 *
 * @author Tolga
 * Ana içicek : 
 */
public class HouseBlend extends Beverage{
    
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    
    public double cost() {
        return 1.99;
    }
}
