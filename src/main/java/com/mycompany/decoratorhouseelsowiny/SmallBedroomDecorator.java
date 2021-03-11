/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;

/**
 *
 * @author elsow
 */
public class SmallBedroomDecorator extends HouseDecorator {
    
     public SmallBedroomDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding small bedroom");
        desc += " ,Small room";
    }
    
    public int cost(){
        return baseHome.cost()+ 10000;
    }
    
    public int area(){
        return baseHome.area() + 300;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Small Bedroom";
    }
    
}
