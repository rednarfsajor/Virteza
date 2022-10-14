/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virteza.tarea2;


public class Camisa {
    private String Marca;
    private String Confeccion;
    private String tipo;
    private String Talla;
    private String Color;

    public Camisa() {
    }

    public Camisa(String Marca, String Confeccion, String tipo, String Talla, String Color) {
        this.Marca = Marca;
        this.Confeccion = Confeccion;
        this.tipo = tipo;
        this.Talla = Talla;
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public String getConfeccion() {
        return Confeccion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTalla() {
        return Talla;
    }

    public String getColor() {
        return Color;
    }
    
    
    
}
