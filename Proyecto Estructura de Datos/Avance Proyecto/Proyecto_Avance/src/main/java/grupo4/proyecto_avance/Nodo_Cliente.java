/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Nodo_Cliente {
    private Cliente Persona;
    private Nodo_Cliente R;
    private Nodo_Cliente L;

    public Nodo_Cliente(Cliente Persona) {
        this.Persona = Persona;
    }

    
    
    public Cliente getPersona() {
        return Persona;
    }

    public Nodo_Cliente getR() {
        return R;
    }

    public Nodo_Cliente getL() {
        return L;
    }

    public void setPersona(Cliente Persona) {
        this.Persona = Persona;
    }

    public void setR(Nodo_Cliente R) {
        this.R = R;
    }

    public void setL(Nodo_Cliente L) {
        this.L = L;
    }
    
    
}
