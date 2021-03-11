
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
import java.util.HashMap;
public abstract class MyHome {
    public HashMap<MyHome, Integer> homeDecorators = new HashMap<MyHome, Integer>();
    public int cost;
    public int area;
    public String desc = "Base Model with";
   // public LivingRoomDecorator living_room;
   // public KitchenDecorator kitchen;

    public String getDesc(){
        return desc;
    };
    public abstract HashMap getHomeDecorators();
    public abstract int cost();
    public abstract int area();
    
}
