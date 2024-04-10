
package virteza.tarea2;


public class NodoP {

    
    private Camisa Shirt;
    private NodoP Next;
    
    public NodoP() {
    }

    public NodoP(Camisa Shirt) {
        this.Shirt = Shirt;
    }
    

    public void setShirt(Camisa Shirt) {
        this.Shirt = Shirt;
    }

    public void setNext(NodoP Next) {
        this.Next = Next;
    }

    public Camisa getShirt() {
        return Shirt;
    }

    public NodoP getNext() {
        return Next;
    }
    
    
    
}
