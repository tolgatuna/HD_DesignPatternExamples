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
public interface Command {
    public  void execute();
    public  void undo();
}
