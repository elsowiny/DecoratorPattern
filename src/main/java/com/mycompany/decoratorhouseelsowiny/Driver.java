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
public class Driver {
    public static void main(String[] args) {

      MyHome smartHome = new MyHouseConcrete();
      int Mortgage = smartHome.getCost();
      System.out.println(Mortgage);
   }
    
}
