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
public abstract class CaffeineBeverage {
    
    // Template Method : 
    /*
     * The template method defines the steps of an algorithm and allows 
     * subclasses to provite the implementation for one or more steps.
     */
    final void prepareReceipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater() {
        System.out.println("Boil Water...");
    }
    
    void pourInCup(){
        System.out.println("Pour Into a cup...");
    }
}
