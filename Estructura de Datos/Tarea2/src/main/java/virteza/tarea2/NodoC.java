
package virteza.tarea2;


public class NodoC {
    private Persona humano;
    private NodoC Next;

    public NodoC() {
    }

    public NodoC(Persona humano) {
        this.humano = humano;
    }

    public Persona getHumano() {
        return humano;
    }

    public NodoC getNext() {
        return Next;
    }

    public void setHumano(Persona humano) {
        this.humano = humano;
    }

    public void setNext(NodoC Next) {
        this.Next = Next;
    }
}
