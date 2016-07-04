/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch7_adapterpattern_ex2;

/**
 *
 * @author Tolga
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public boolean remove();
}
