/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_7;

/**
 *
 * @author LABORATORIO
 */
public class Nodo {
    private Persona humano;
    private Nodo next;
    
    public void setHumano(Persona humano) {
        this.humano = humano;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Persona getHumano() {
        return humano;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo(Persona humano) {
        this.humano = humano;
    }
}
