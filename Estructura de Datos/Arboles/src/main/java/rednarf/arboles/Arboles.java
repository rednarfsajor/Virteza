/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package rednarf.arboles;

/**
 *
 * @author Rednarf
 */
public class Arboles {

    public static void main(String[] args) {
        Arbol tree = new Arbol();
        
        tree.inserta(50); 
        tree.inserta(20);
        tree.inserta(80);
        tree.inserta(15);
        tree.inserta(30);
        tree.inserta(60);
        tree.inserta(40);
        tree.inserta(90);
        tree.inserta(75);
        tree.inserta(33);
        tree.inserta(82);
        
        tree.inorden();
    }
}
