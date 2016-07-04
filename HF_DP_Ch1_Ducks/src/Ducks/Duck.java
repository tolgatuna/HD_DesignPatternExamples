/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import QuackBehaviors.QuackBehavior;
import FlyBehaviors.FlyBehavior;

/**
 *
 * @author Tolga
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void swim() {
        System.out.println("Ducks.Duck.swim()");
    }
    
    public void display() {
        System.out.println("Ducks.Duck.display()");
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void setFlyBehavior(FlyBehavior b) {
        this.flyBehavior = b;
    }
    
    public void setQuackBehavior(QuackBehavior b) {
        this.quackBehavior = b;
    }
    
}
