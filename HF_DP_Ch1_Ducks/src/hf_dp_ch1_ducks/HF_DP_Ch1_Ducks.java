/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch1_ducks;

import Ducks.Duck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;

/**
 *
 * @author Tolga
 */
public class HF_DP_Ch1_Ducks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck d1 = new RedHeadDuck();
        Duck d2 = new RubberDuck();
        
        d1.performQuack();
        d1.performFly();
        
        d2.performFly();
        d2.performQuack();
    }
    
}
