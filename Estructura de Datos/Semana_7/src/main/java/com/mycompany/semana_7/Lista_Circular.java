/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_7;

/**
 *
 * @author LABORATORIO
 */
public class Lista_Circular {
    private Nodo Head;
    private Nodo Tail;
    
    public void Insertar(Persona Value){
        Nodo nuevonodo = new Nodo(Value);
        if(Head==null){
            Head=nuevonodo;
            Tail= Head;
            Tail.setNext(Head);
        }
        else if(Head.getHumano().getId()>nuevonodo.getHumano().getId()){
            nuevonodo.setNext(Head);
            Head=nuevonodo;
            Tail.setNext(Head);
        }
        else if(Tail.getHumano().getId()<nuevonodo.getHumano().getId()){
            Tail.setNext(nuevonodo);
            Tail = nuevonodo;
            Tail.setNext(Head);
        }
        else{
            Nodo aux=Tail;
            while(aux.getNext().getHumano().getId()<nuevonodo.getHumano().getId()){
                aux=aux.getNext();
            }
            nuevonodo.setNext(aux);
            aux.setNext(nuevonodo);
        }
    }
    
    
    public void imprimir(){
        Nodo aux=Head;
        while(aux!=Tail){
            System.out.println(aux.getHumano().toString());
            aux=aux.getNext();
        }
    }
}
