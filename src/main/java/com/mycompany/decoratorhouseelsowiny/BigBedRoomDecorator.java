/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;



public class BigBedRoomDecorator extends HouseDecorator{
    
    public BigBedRoomDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Big bed room");
        desc += " ,BigBedRoom";
    }
    
    public int cost(){
        return baseHome.cost()+ 12561;
    }
    
    public int area(){
        return baseHome.area() + 450;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", Big Bedroom";
    }
}
