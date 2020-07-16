/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week5;

/**
 *
 * @author chuchu
 * @param <T>
 */
public class Month<T> {
    private T month; 
    public void add(T month){
        this.month = month;
    }
    public T get(){
        return month;
    } 
  
    
}

