
package Clases;
import java.util.*;


public class Alquiler {
    private String ID;
    private Cliente Persona;
    private Vehiculo Carro;
    private int Dias;
    private String Estado;
    private double monto;
    private String Fecha;

    public Alquiler(String ID, Cliente Persona, Vehiculo Carro, int Dias, String Estado, double monto, String Fecha) {
        this.ID = ID;
        this.Persona = Persona;
        this.Carro = Carro;
        this.Dias = Dias;
        this.Estado = Estado;
        this.monto = monto;
        this.Fecha = Fecha;
    }

    
    
    public Alquiler(Cliente Persona, Vehiculo Carro, int Dias, double monto) {
        this.Persona = Persona;
        this.Carro = Carro;
        this.Dias = Dias;
        this.Estado = "REGISTRADO";
        this.monto = monto+(monto*0.13);
        boolean val=false;
        while(!val){
            Random n = new Random();
            this.ID="A-"+String.valueOf(n.nextInt(1000));
            val=validation(this.ID);
        }
        this.Fecha=new Date().toString();
    }

    public String getFecha() {
        return Fecha;
    }

    private boolean validation(String ID){
        boolean V=General.Alquileres_Registrados.buscar(ID)==null;
        return V;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    
    
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
