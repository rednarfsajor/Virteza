/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Nodo_Alquiler {
    private Alquiler Prestamo;
    private Nodo_Alquiler Next;

    
     public Nodo_Alquiler() {
    }

    public Nodo_Alquiler(Alquiler Prestamo) {
        this.Prestamo = Prestamo;
    }
     
     
    public void setPrestamo(Alquiler Prestamo) {
        this.Prestamo = Prestamo;
    }

    public void setNext(Nodo_Alquiler Next) {
        this.Next = Next;
    }

   

    
    
    public Alquiler getPrestamo() {
        return Prestamo;
    }

    public Nodo_Alquiler getNext() {
        return Next;
    }
    
    
}
