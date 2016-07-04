/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch6_commandpattern;

/**
 *
 * @author Tolga
 */
public class HF_DP_Ch6_CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl =  new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        
        remoteControl.setCommant(lightOn);
        remoteControl.buttonWasPressed();
        
        remoteControl.setCommant(lightOff);
        remoteControl.buttonWasPressed();
    }
    
}
