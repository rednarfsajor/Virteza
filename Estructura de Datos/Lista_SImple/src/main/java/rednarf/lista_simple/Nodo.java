/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rednarf.lista_simple;

/**
 *
 * @author Rednarf
 */
public class Nodo {
    private int Value;
    private Nodo Next;

    public Nodo(int Value) {
        this.Value = Value;
    }

    public Nodo() {
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }

    public int getValue() {
        return Value;
    }

    public Nodo getNext() {
        return Next;
    }
}
