/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch4_factorypattern;

/**
 *
 * @author Tolga
 */
public class HF_DP_Ch4_FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        
        Pizza pizza = factory.createPizza("cheese");
        
        pizza.prepare();
        pizza.bake();
    }
    
}
