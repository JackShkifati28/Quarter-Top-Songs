/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipclients;

import java.io.IOException;

/**
 * The LinkList class.
 */
public class LinkedList {

    String data;
    LinkedList next;
   
    
    /**
     * No argument constructor.
     */
    public LinkedList(){
        
    }
    
    /**
     * The LinkedList constructor initializes the data and next pointer.
     * @param object a String.
     * @throws IOException  
     */
    public LinkedList(String object) throws IOException {
        next = null;
        data = object;
    }
    
    /**
     * The displayLink method returns the data.
     * @return data.
     */
    public String displayLink() {
        return data;
    }   

}
