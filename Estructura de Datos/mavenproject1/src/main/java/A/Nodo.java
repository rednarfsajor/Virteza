/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Nodo{
    private Orden Value;
    private Plato Value2;
    private Nodo Next;

    public Nodo() {
    }

    public Nodo(Plato Value2) {
        this.Value2 = Value2;
    }
    public Nodo(Orden Value) {
        this.Value = Value;
    }
     

    public void setValue2(Plato Value2) {
        this.Value2 = Value2;
    }

    public Plato getValue2() {
        return Value2;
    }
    
    public Orden getValue() {
        return Value;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setValue(Orden Value) {
        this.Value = Value;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }
    
    
}
