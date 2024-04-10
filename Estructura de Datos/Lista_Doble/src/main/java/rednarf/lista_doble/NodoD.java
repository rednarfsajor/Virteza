
package rednarf.lista_doble;

public class NodoD {

    
    private int value;
    private NodoD back;
    private NodoD next;
    
    
    public NodoD(int value) {
        this.value = value;
    }

    public NodoD() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setBack(NodoD back) {
        this.back = back;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public NodoD getBack() {
        return back;
    }

    public NodoD getNext() {
        return next;
    }
    
    
    
}
