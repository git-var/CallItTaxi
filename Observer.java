/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

/**
 *
 * @author SONY
 */
  public abstract class Observer {
   protected subjectObserver subject;
   public abstract void update(String msg);
}

