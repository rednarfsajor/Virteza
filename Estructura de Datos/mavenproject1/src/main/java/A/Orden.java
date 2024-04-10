/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Orden {

    public Orden(String Cliente, int Cedula, String Producto, double Total, boolean Discapacidad) {
        this.Cliente = Cliente;
        this.Cedula = Cedula;
        this.Producto = Producto;
        this.Total = Total;
        this.Discapacidad = Discapacidad;
    }
     private String Cliente;
    private int Cedula;
    private String Producto;
    private double Total;
    private boolean Discapacidad;

    public String getCliente() {
        return Cliente;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getProducto() {
        return Producto;
    }

    public double getTotal() {
        return Total;
    }

    public boolean isDiscapacidad() {
        return Discapacidad;
    }
    
    
}
