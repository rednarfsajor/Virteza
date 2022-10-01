/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;

/**
 *
 * @author LABORATORIO
 */
public class Stack<T> {
    private node<T> top;
    
    public void push (T value){
        node<T> newNode= new node<T> (value);
        if(top == null){
            top=newNode;
        }
        else{
            newNode.setNext(top);
        }
    }
    
}
