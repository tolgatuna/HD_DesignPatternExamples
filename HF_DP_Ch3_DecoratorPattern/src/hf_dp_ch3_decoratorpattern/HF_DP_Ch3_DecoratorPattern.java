/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch3_decoratorpattern;

import Beverages.HouseBlend;
import Beverages.Milk;
import Beverages.Mocha;
import Beverages.Whip;

/**
 *
 * @author Tolga
 */
public class HF_DP_Ch3_DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage b1 = new HouseBlend();
        b1 = new Mocha(b1);
        b1 = new Whip(b1);
        b1 = new Milk(b1);
        
        System.out.println("b1 : " + b1.getDescription() + " - price : " + b1.cost());
    }
    
}
