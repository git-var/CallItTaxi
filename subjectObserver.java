/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONY
 */
public class subjectObserver {
    private List<Observer> observers = new ArrayList<Observer>();
   private String state;

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
      notifyAllObservers(state);
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(String state){
      for (Observer observer : observers) {
         observer.update(state);
      }
   } 	
}
