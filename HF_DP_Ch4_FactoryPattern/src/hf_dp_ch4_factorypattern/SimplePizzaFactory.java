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
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }
        
        return pizza;
    }
}
