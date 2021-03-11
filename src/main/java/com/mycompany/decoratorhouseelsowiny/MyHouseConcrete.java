/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;

import java.util.*;

/**
 *
 * @author elsow
 */
public class MyHouseConcrete extends MyHome {
   
    
    public MyHouseConcrete(){
        //MyHome kitchen = new KitchenDecorator();
        //MyHome livingRoom = new LivingRoomDecorator();
        //homeDecorators.put(kitchen, 1);
        //homeDecorators.put(livingRoom, 1);
    }
    
    public String getDesc(){
        return desc;
    }
    
    public int cost(){
        return cost;
    }
    
    public int area(){
        return area;
    }
    
    
}
