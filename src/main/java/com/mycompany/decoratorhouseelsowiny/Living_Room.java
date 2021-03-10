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
public class Living_Room extends MyHome {
    public int area;
    public int cost;
    //would use double but no decimals in this case.
    Living_Room(){
        this.cost = 15421;
    //when instatiated the cost is computed
            }
}
