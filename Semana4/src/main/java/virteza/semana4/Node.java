/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virteza.semana4;

/**
 *
 * @author Rednarf
 */
public class Node<T> {
    private T Value;
    private Node <T> Next;

    public Node(T Value) {
        this.Value = Value;
    }

    public void setValue(T Value) {
        this.Value = Value;
    }

    public void setNext(Node<T> Next) {
        this.Next = Next;
    }

    public T getValue() {
        return Value;
    }

    public Node<T> getNext() {
        return Next;
    }
}
