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
public abstract class HouseDecorator extends MyHome {
    protected MyHome baseHome;
    
    public HouseDecorator(MyHome newHome){
        baseHome = newHome;
    }
    
    public String getDescription(){
        return baseHome.desc;
    }
    
    public int cost(){
        return cost;
    }

    public int area(){
        return area;
    }
    public String getDesc(){
        return desc;
    };
    
    
    
    
    
}
