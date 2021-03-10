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
public abstract class MyHome {

    public int cost = 13544 + 15421;
    
    public int area = 500 + 560; //sqft
    public String desc;
    
    public Living_Room living_rooms;
    public Kitchen kitchens ;

    public int getCost() {
        return this.cost;
    
    }
    
    public abstract int cost();
    public abstract String getDesc();


}
