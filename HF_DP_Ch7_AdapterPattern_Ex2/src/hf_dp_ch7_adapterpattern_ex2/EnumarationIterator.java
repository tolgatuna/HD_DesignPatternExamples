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
public class EnumarationIterator implements Iterator {
    Enumaration enumaration;

    public EnumarationIterator(Enumaration enumaration) {
        this.enumaration = enumaration;
    }

    @Override
    public boolean hasNext() {
        return enumaration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumaration.nextElement();
    }

    @Override
    public boolean remove() {
        throw new UnsupportedOperationException(); 
    }
    
}
