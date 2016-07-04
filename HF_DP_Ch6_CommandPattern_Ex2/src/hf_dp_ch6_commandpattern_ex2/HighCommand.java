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
public class HighCommand implements Command{
    CeilingFan fan;
    int lastState;

    public HighCommand(CeilingFan fan) {
        this.fan = fan;
    }
    
    public void execute() {
        lastState = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        switch (lastState) {
            case CeilingFan.OFF:
                fan.off();
                break;
            case CeilingFan.LOW:
                fan.low();
                break;
            case CeilingFan.MED:
                fan.med();
                break;
            case CeilingFan.HIGH:
                fan.high();
                break;
            default:
                fan.off();
                break;
        }
    }
    
}
