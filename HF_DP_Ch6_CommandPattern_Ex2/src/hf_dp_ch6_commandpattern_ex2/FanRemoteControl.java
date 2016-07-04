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
public class FanRemoteControl {
    Command slot;
    
    public void setCommand(Command command) {
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
    
    public void undoButtonWasPressed() {
        slot.undo();
    }
}
