/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import FlyBehaviors.FlyWithWings;
import QuackBehaviors.Quack;

/**
 *
 * @author Tolga
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Red Head");
    }
}
