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
public class CarGarageDecorator extends HouseDecorator{
    
    public CarGarageDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Garage");
        desc += " ,Garage";
    }
    
    public int cost(){
        return baseHome.cost()+ 500;
    }
    
    public int area(){
        return baseHome.area() + 250;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Garage";
    }
    
}
