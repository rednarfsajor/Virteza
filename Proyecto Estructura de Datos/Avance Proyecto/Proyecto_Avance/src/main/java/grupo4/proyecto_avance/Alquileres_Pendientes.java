/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Alquileres_Pendientes {
    private Nodo_Alquiler Head;
    private Nodo_Alquiler Tail;

    public Nodo_Alquiler getHead() {
        return Head;
    }

    public Nodo_Alquiler getTail() {
        return Tail;
    }

    public void setHead(Nodo_Alquiler Head) {
        this.Head = Head;
    }

    public void setTail(Nodo_Alquiler Tail) {
        this.Tail = Tail;
    }
    
    public void insertar(Alquiler prestamo){
        Nodo_Alquiler newnodo = new Nodo_Alquiler(prestamo);
        if(Head==null){
            Head=newnodo;
            Tail=newnodo;
        }
        else{
            Nodo_Alquiler aux=Tail;
            aux.setNext(newnodo);
            Tail=newnodo;
        }
        
    }
    public void atender(){
        if(Head!=null){
            Nodo_Alquiler aux=Head;
            Head=Head.getNext();
            General.Alquileres_Registrados.modificar(aux.getPrestamo().getID());
            //ALQUILER PROCESADO Y ELIMINADO DE LA COLA
        }
        else{
            //NO HAY ALQUILERES QUE ATENDER
        }
    }
}
