/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch8_templatemethodpattern;

/**
 *
 * @author Tolga
 */
public class Coffee extends CaffeineBeverage {

    // It is ok : 
    @Override 
    void boilWater() {
        System.out.println("hf_dp_ch8_templatemethodpattern.Coffee.boilWater()");
    }
    // But that is not : (Because of the final and template method pattern) : 
    /* @Override 
     * void prepareReceipe() {
     *    
     * }
     */
    
    @Override
    void brew() {
        System.out.println("Dripping Coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Sugar...");
    }
    
}
