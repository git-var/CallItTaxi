/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import com.mvc.people.customertype.categoryinterface;

/**
 *
 * @author SONY
 */
public class userFactory {
    public static categoryinterface getuser(String category){
        switch (category) {
            case "student":
                return new student();
            case "worker":
                return new worker();
        }
        return null;
    }
    
}
