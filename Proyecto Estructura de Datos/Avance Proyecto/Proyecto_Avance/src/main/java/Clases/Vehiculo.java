package Clases;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int cilindrada;
    private String combustible;
    private int capacidad;
    private double precio;
    private String extras;
    private String status;
    
    public Vehiculo(String placa, String marca, String modelo, int año, String color, int cilindrada, String combustible, int capacidad, double precio, String extras, String status) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.capacidad = capacidad;
        this.precio = precio;
        this.extras = extras;
        this.status = status;
    }

    

    public Vehiculo(String placa, String marca, String modelo, int año, String color, int cilindrada, String combustible, int capacidad, double precio, String extras) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.capacidad = capacidad;
        this.precio = precio;
        this.extras = extras;
        this.status = "DISPONIBLE";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getExtras() {
        return extras;
    }

}
