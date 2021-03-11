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
public class WalkInClosetDecorator extends HouseDecorator{


    public WalkInClosetDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Walk-in Closet");
        desc += " ,Walk-in Closet";
    }
    
    public int cost(){
        return baseHome.cost()+ 2130;
    }
    
    public int area(){
        return baseHome.area() + 50;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Walk-in Closet";
    }
}
