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
public class MasterBedroomDecorator extends HouseDecorator {
    

    public MasterBedroomDecorator(MyHome newHome){
        //spent half hour confused about "super(newHome);"
        //giving error only to realize bedroom was spelled like BedRoom....
        super(newHome);
        System.out.println("Adding MasterBedroom");
        desc += " ,masterBedroom";
    }
    
    public int cost(){
        return baseHome.cost()+ 15000;
    }
    
    public int area(){
        return baseHome.area() + 550;
    }
    
    
    
    public String getDesc(){
        return baseHome.getDesc() + ", Master Bedroom";
    }
    
}
