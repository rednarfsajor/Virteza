
package Tarea_Recursividad;


public class Vector {
    private int[] vector;
    public Vector(int[] v) {
        vector = v;
    }
    
    
    public void leerVector(int a, int b, int c){
        if (pos == vector.length-1) { System.out.println("Elemento en posición "+pos + " es "+vector[pos]);}
        else {
            System.out.println("Elemento en posición "+pos + " es "+vector[pos]);
            leerVector(pos+1);
        }
    }
    
}
