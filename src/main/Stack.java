/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author saopayne
 */
public interface Stack {
       
    //accessor methods
    public int size();
    public boolean isEmpty();
    public Object top() throws StackEmptyException; 
            
           
    //update methofs
    public void push(Object element);
    public Object pop () throws StackEmptyException;
}
