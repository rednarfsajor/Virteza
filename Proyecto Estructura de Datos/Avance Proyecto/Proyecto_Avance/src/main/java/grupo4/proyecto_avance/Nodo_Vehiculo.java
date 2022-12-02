
package grupo4.proyecto_avance;


public class Nodo_Vehiculo {
    private Vehiculo Carro;
    private Nodo_Vehiculo Next;
   private Nodo_Vehiculo Back;

    public Nodo_Vehiculo(Vehiculo Carro) {
        this.Carro = Carro;
    }

    public Nodo_Vehiculo() {
    }
    

    public Vehiculo getCarro() {
        return Carro;
    }

    public Nodo_Vehiculo getNext() {
        return Next;
    }

    public Nodo_Vehiculo getBack() {
        return Back;
    }

    public void setCarro(Vehiculo Carro) {
        this.Carro = Carro;
    }

    public void setNext(Nodo_Vehiculo Next) {
        this.Next = Next;
    }

    public void setBack(Nodo_Vehiculo Back) {
        this.Back = Back;
    }
   
}
