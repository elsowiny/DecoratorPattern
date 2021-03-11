/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;

import java.util.Scanner;

/**
 *
 * @author elsow
 */
public class HelperMethods {
    

    //our helper methods that implement the decorators for us dependent on 
    //user input
    
    public static MyHome KitchenMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            System.out.println(i);
            smartHome = new KitchenDecorator(smartHome);
        }
        return smartHome;
    }
    
    
    
     public static MyHome LivingRoomMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            System.out.println(i);
            smartHome = new LivingRoomDecorator(smartHome);
        }
        return smartHome;
    }
     
     
     
     public static MyHome MasterBedroomMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            smartHome = new MasterBedroomDecorator(smartHome);
        }
        return smartHome;
    }
     
    public static MyHome BigBedroomMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            smartHome = new BigBedRoomDecorator(smartHome);
        }
        return smartHome;
    } 
    
      public static MyHome SmallBedroomMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            smartHome = new SmallBedroomDecorator(smartHome);
        }
        return smartHome;
    } 
      
      
    public static MyHome BathroomMaker(int n, MyHome smartHome){
        for(int i=1;i<=n;i++){
            smartHome = new BathroomDecorator(smartHome);
        }
        return smartHome;
    }    
      
      
      
    
}
