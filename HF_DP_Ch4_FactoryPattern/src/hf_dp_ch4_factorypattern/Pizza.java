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
public class Pizza {
    
    public void prepare() {
        System.out.println("hf_dp_ch4_factorypattern.Pizza.prepare()");
    }
    
    public void bake() {
        System.out.println("hf_dp_ch4_factorypattern.Pizza.bake()");
    }
    
    public void cut() {
        System.out.println("hf_dp_ch4_factorypattern.Pizza.cut()");
    }
    
    public void box() {
        System.out.println("hf_dp_ch4_factorypattern.Pizza.box()");
    }
}
