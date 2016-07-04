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
public class HF_DP_Ch6_CommandPattern_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        HighCommand HIGH = new HighCommand(fan);
        
        FanRemoteControl fanRemoteControl = new FanRemoteControl();
        fanRemoteControl.setCommand(HIGH);
        fanRemoteControl.buttonWasPressed();
        fanRemoteControl.undoButtonWasPressed();
    }
    
}
