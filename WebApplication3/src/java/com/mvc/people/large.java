/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import com.mvc.people.fareCalc.Fare;

/**
 *
 * @author SONY
 */
public class large implements Fare{
        public int price;

    @Override
    public void calc(Context context,int time) {
                      context.setFare(this);	
      
        if(time>=8 && time<=21)
        {
            price=9;
        }
        else
            price=11;
    }
    public int pric()
       {
           return price;
       }
    
}

