/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import FlyBehaviors.FlyNoWay;
import FlyBehaviors.FlyWithWings;
import QuackBehaviors.Quack;
import QuackBehaviors.Squeak;

/**
 *
 * @author Tolga
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    
    @Override
    public void display() {
        System.out.println("Rubber");
    }
}
