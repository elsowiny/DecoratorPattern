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
public class ClosetDecorator extends HouseDecorator{
    
    public ClosetDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Closet");
        desc += " ,Normal Closet";
    }
    
    public int cost(){
        return baseHome.cost()+ 1000;
    }
    
    public int area(){
        return baseHome.area() + 15;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Normal Closet";
    }
    
}
