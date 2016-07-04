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
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    
    }
    
    public void setCommant(Command command) {
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
    
    public void undoButtonWasPressed() {
        slot.undo();
    }
    
}
