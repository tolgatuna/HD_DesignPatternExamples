/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch7_adapterpattern;

/**
 *
 * @author Tolga
 */
public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
    
}
