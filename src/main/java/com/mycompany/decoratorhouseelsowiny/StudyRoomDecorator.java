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
public class StudyRoomDecorator extends HouseDecorator{
    
    public StudyRoomDecorator(MyHome newHome){
        super(newHome);
        System.out.println("Adding Study Room");
        desc += " ,StudyRoom";
    }
    
    public int cost(){
        return baseHome.cost()+ 14896;
    }
    
    public int area(){
        return baseHome.area() + 550;
    }
      
    public String getDesc(){
        return baseHome.getDesc() + ", StudyRoom";
    }
    
}
