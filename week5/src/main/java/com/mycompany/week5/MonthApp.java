package com.mycompany.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Group 2
 */
public class MonthApp {

    public static void main(String[] args) {
        Month<Integer> monthIndex = null;
        Month<String> monthName = null;
        
// instatination of two arraylists that store monthIndex and  monthName objects.
        ArrayList<Integer> monthIndexCollector = new ArrayList<>();
        ArrayList<String> monthNameCollector = new ArrayList<>();
        monthIndex = new Month<>();
        monthName = new Month<>();
        
//      instantiate Month objects to store month indices and name
        for (int i = 1; i < 13; i++) {
            monthIndex.add(i);
            monthIndexCollector.add(monthIndex.get());
        }
//      instantiate Month objects to store month indices 
        monthName.add("January");
        monthNameCollector.add(monthName.get());
        monthName.add("February");
        monthNameCollector.add(monthName.get());
        monthName.add("March");
        monthNameCollector.add(monthName.get());
        monthName.add("April");
        monthNameCollector.add(monthName.get());
        monthName.add("May");
        monthNameCollector.add(monthName.get());
        monthName.add("June");
        monthNameCollector.add(monthName.get());
        monthName.add("July");
        monthNameCollector.add(monthName.get());
        monthName.add("August");
        monthNameCollector.add(monthName.get());
        monthName.add("September");
        monthNameCollector.add(monthName.get());
        monthName.add("October");
        monthNameCollector.add(monthName.get());
        monthName.add("November");
        monthNameCollector.add(monthName.get());
        monthName.add("December");
        monthNameCollector.add(monthName.get());
        
//Instantinate and populate the Hash map
        HashMap<Integer, String> monthCollection = new HashMap<>();
        for(int i =0;i < 12;i++){
            monthCollection.put(monthIndexCollector.get(i), monthNameCollector.get(i));
        }
        
//Printout the result
        for (Map.Entry<Integer, String> en : monthCollection.entrySet()) {
            Integer key = en.getKey();
            String value = en.getValue();
            System.out.println(key + " = " + value);
            
        }
            
        }
            
  
    }


