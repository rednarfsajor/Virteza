
package grupo4.tarea_listas;


public class Nodo {

    
    private int value;
    private Nodo next;

    
    public Nodo() {
    }

    public Nodo(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
