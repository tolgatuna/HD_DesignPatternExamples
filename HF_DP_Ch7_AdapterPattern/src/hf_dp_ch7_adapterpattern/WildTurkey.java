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
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
    
}
