
package grupo4.grupo4_prueba1;


public class Nodo<T> {
    private T Value;
    private Nodo<T> Next;

    public Nodo() {
    }

    public Nodo(T Value) {
        this.Value = Value;
    }
    
    public T getValue() {
        return Value;
    }

    public Nodo<T> getNext() {
        return Next;
    }

    public void setValue(T Value) {
        this.Value = Value;
    }

    public void setNext(Nodo<T> Next) {
        this.Next = Next;
    }
    
    
}
