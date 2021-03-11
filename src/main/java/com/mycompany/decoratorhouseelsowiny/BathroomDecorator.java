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
public class BathroomDecorator extends HouseDecorator {
    
    public BathroomDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding bathroom");
        desc += " ,Bathroom";
    }
    
    public int cost(){
        return baseHome.cost()+ 4000;
    }
    
    public int area(){
        return baseHome.area() + 120;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Bathroom";
    }
    
}
