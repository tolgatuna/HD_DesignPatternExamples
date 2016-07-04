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
public class HF_DP_Ch7_AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        testDrive(duck);
        testDrive(turkeyAdapter);
        
        
    }
    
    static void testDrive(Duck duck) {
        duck.quack();
        duck.fly();
    }
    
}


