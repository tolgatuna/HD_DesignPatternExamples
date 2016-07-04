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
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
       this.turkey = turkey; 
    }
    
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 5 times 
        for(int i = 0 ; i < 5 ; i++)
            turkey.fly();
    }
    
}
