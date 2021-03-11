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
public class KitchenDecorator extends HouseDecorator{
   
     // protected MyHome baseHome;
    
    public KitchenDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Kitchen");
        desc += " ,kitchen";
    }
    
    public int cost(){
        return baseHome.cost()+ 13544;
    }
    
    public int area(){
        return baseHome.area() + 500;
    }
    
  
    
    public String getDesc(){
        return baseHome.getDesc() + ", Kitchen";
    }
}
