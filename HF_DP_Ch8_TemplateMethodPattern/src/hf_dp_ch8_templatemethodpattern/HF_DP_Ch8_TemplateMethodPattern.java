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
public class HF_DP_Ch8_TemplateMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaffeineBeverage [] bev = new CaffeineBeverage[2];
        
        bev[0] = new Coffee();
        bev[1] = new Tea();
        
        bev[0].prepareReceipe();
        bev[1].prepareReceipe();
    }
    
}
