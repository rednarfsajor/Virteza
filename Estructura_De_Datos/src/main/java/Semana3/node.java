/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;

/**
 *
 * @author LABORATORIO
 */
public class node<T> {
    private T value;
    private node<T> next;
    private node<T> back;
    
    public node(){
        
    }
    
    public node(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public node<T> getBack() {
        return back;
    }

    public void setBack(node<T> back) {
        this.back = back;
    }
    

}
