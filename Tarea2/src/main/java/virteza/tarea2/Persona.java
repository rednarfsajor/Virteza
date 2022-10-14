
package virteza.tarea2;


public class Persona {

    
    private int cedula;
    private String tipo;
    private double hora;
    private String localidad;
    
    public Persona() {
    }

    public Persona(int cedula, String tipo, double hora, String localidad) {
        this.cedula = cedula;
        this.tipo = tipo;
        this.hora = hora;
        this.localidad = localidad;
    }

    
    
    public int getCedula() {
        return cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public double getHora() {
        return hora;
    }

    public String getLocalidad() {
        return localidad;
    }
    
    
    
}
