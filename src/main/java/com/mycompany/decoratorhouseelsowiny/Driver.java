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
      //add kitchen
      smartHome = new KitchenDecorator(smartHome);
      smartHome = new LivingRoomDecorator(smartHome);
      int Mortgage = smartHome.cost();
      int area = smartHome.area();
      System.out.println("Price is $" + Mortgage);
      System.out.println("Area is " + area);
      System.out.println("How many kitchens would you like?");
      Scanner scan = new Scanner(System.in);
      

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        // Displaying the number 
        System.out.println("The number entered by user: "+num);
        
        for(int i=1;i<=num;i++){
            System.out.println(i);
            smartHome = new KitchenDecorator(smartHome);
        }
     
      Mortgage = smartHome.cost();
      area = smartHome.area();  
      System.out.println("Price is $" + Mortgage);
      System.out.println("Area is " + area);
      String descrip = smartHome.getDesc();
      System.out.println(descrip);
      
      
   }
    
}
