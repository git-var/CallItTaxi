/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import com.mvc.people.orderinterface.component;

/**
 *
 * @author SONY
 */
public class Order implements component{
     private static Order instance;

   //make the constructor private so that this class cannot be
   //instantiated
   private Order(){}

   //Get the only object available
   public static Order getInstance(){
      if(instance==null)
      {
      instance=new Order();    
             return instance;
      }
      return instance;
   }
    public String types;
    public String address;
    public String phno;
    public String time;

    /**
     * @return the type
     */
    public String getTypes() {
        return types;
    }

    /**
     * @param type the type to set
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phno
     */
    public String getPhno() {
        return phno;
    }

    /**
     * @param phno the phno to set
     */
    public void setPhno(String phno) {
        this.phno = phno;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
}
