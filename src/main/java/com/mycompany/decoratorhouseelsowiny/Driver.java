 // import the HashMap class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decoratorhouseelsowiny;
import java.util.*; 
import java.util.Scanner;
/**
 *
 * @author elsow
 */
public class Driver {
    public static void main(String[] args) {

      MyHome smartHome = new MyHouseConcrete();
      smartHome = new KitchenDecorator(smartHome);
      smartHome = new LivingRoomDecorator(smartHome);
      System.out.println("You have got the base model as of now with a "
              + "kitchen and living room ");
      int Mortgage = smartHome.cost();
      int area = smartHome.area();
      
      System.out.println("The current price of the base model is $" + Mortgage);
      System.out.println("The current area in sqft is " + area);
      
      
      
      
      //Ask user their input
      //send each input to our helper method which decorates our base home model
      //with whatever decorators they want
      //
      
        System.out.println("How many kitchens would you like?\n");
        Scanner scan = new Scanner(System.in);
        // This method reads the number provided using keyboard
        int kitchens = scan.nextInt();
        smartHome = HelperMethods.KitchenMaker(kitchens, smartHome);
        
        
        System.out.println("How many living rooms would you like?\n");
        int livingRooms = scan.nextInt();
        smartHome = HelperMethods.LivingRoomMaker(livingRooms, smartHome);
        
        System.out.println("How many Master-Bedrooms would you like?\n");
        int masterBedRooms = scan.nextInt();
        smartHome = HelperMethods.MasterBedroomMaker(masterBedRooms, smartHome);
        
        System.out.println("How many Big-Bedrooms would you like?\n");
        int bigBedRooms = scan.nextInt();
        smartHome = HelperMethods.BigBedroomMaker(bigBedRooms, smartHome);
        
        System.out.println("How many Small-Bedrooms would you like?\n");
        int smallBedRooms = scan.nextInt();
        smartHome = HelperMethods.SmallBedroomMaker(smallBedRooms, smartHome);
        
        System.out.println("How many Bathrooms would you like?\n");
        int bathrooms = scan.nextInt();
        smartHome = HelperMethods.BathroomMaker(smallBedRooms, smartHome);
        
        
        // Closing Scanner after the use
        scan.close();
        

     
      Mortgage = smartHome.cost();
      area = smartHome.area();  
      System.out.println("Price is $" + Mortgage);
      System.out.println("Area is " + area);
      String descrip = smartHome.getDesc();
      System.out.println(descrip);
      
      
   }
    
    
    
    
}
