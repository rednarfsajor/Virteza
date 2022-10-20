/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Plato {
     private double ID;
     private boolean Cubiertos;

    public Plato() {
        this.ID=(Math.random()*10000+1);
    }

    public double getID() {
        return ID;
    }

    public boolean isCubiertos() {
        return Cubiertos;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public void setCubiertos(boolean Cubiertos) {
        this.Cubiertos = Cubiertos;
    }
     
     
}
