/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Cliente {
    private int cédula;
    private String Nombre_Completo;
    private String fecha;
    private String correo;
    private String categoria; //ZAFIRRO/ORO/PLATA/BRONCE 

    public void setCédula(int cédula) {
        this.cédula = cédula;
    }

    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public int getCédula() {
        return cédula;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
