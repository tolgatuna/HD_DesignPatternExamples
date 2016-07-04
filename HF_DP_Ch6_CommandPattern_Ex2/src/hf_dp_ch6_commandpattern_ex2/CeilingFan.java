/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch6_commandpattern_ex2;

/**
 *
 * @author Tolga
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MED  = 2;
    public static final int LOW  = 1;
    public static final int OFF  = 0;
    
    // Speed of ceiling fan : 
    public int speed;

    public CeilingFan() {
        speed = OFF;
    }
    
    public void high() {
        speed = HIGH;
        System.out.println("Fan Speed : " + HIGH);
    }
    
    public void med() {
        speed = MED;
        System.out.println("Fan Speed : " + MED);
    }
    
    public void low() {
        speed = LOW;
        System.out.println("Fan Speed : " + LOW);
    }
    
   public void off() {
        speed = OFF;
        System.out.println("Fan Speed : " + OFF);
   }

    public int getSpeed() {
        return speed;
    }
   
   
}
