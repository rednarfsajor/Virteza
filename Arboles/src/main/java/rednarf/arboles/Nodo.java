/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rednarf.arboles;

/**
 *
 * @author Rednarf
 */
public class Nodo {
    
    private int id;
    private Nodo L;
    private Nodo R;
    
    public Nodo(int id) {
        this.id = id;
    }

    public Nodo() {
    }
    

    public int getId() {
        return id;
    }

    public Nodo getL() {
        return L;
    }

    public Nodo getR() {
        return R;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setL(Nodo L) {
        this.L = L;
    }

    public void setR(Nodo R) {
        this.R = R;
    }
    
}
