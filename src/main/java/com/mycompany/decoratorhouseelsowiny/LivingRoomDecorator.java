/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;

import java.util.HashMap;

/**
 *
 * @author elsow
 */
public class LivingRoomDecorator extends HouseDecorator {
    
    // protected MyHome baseHome;
    public LivingRoomDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Living Room");
        desc += " ,living room";
    }
    
    public int cost(){
        return baseHome.cost() + 15421;
    }
    
    public int area(){
        return baseHome.area() + 500;
    }
    
    
    public String getDesc(){
        return baseHome.getDesc() + ", Living Room";
    }
}
