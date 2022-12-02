/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Alquiler {
    private String ID;
    private Cliente Persona;
    private Vehiculo Carro;
    private String Estado;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPersona(Cliente Persona) {
        this.Persona = Persona;
    }

    public void setCarro(Vehiculo Carro) {
        this.Carro = Carro;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public String getID() {
        return ID;
    }

    public Cliente getPersona() {
        return Persona;
    }

    public Vehiculo getCarro() {
        return Carro;
    }

    public String getEstado() {
        return Estado;
    }
    
    
    
    
}
