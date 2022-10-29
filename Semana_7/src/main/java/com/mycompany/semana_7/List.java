/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_7;

/**
 *
 * @author LABORATORIO
 */
public class List {
    private Nodo Head;
    
    
    
    public void insertar(Persona Value){
        
        Nodo nuevonodo = new Nodo(Value);
        if(Head==null){
            Head=nuevonodo;
        }
        else if(Head.getHumano().getId()>nuevonodo.getHumano().getId()){
            nuevonodo.setNext(Head);
            Head=nuevonodo;
        }
        else if(Head.getHumano().getId()<nuevonodo.getHumano().getId()&&Head.getNext()==null){
            Head.setNext(nuevonodo);
        }
        else{
            Nodo aux=Head;
            while(aux.getNext()!=null && aux.getNext().getHumano().getId()<nuevonodo.getHumano().getId()){
                aux=aux.getNext();
            }
            nuevonodo.setNext(aux);
            aux.setNext(nuevonodo);
        }

    }
    
    public void imprimir(){
        Nodo aux=Head;
        while(aux!=null){
            System.out.println(aux.getHumano().toString());
            aux=aux.getNext();
        }
    }
    public List() {
    }
}
