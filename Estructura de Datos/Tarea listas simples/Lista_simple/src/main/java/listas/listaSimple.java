/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author macbookpro
 */
public class listaSimple {
    nodo primero;
    nodo ultimo;
    
    public listaSimple(){
                primero = null;
                ultimo = null;
                
    }
    
    public void ingresarNodo(int dato){
        nodo nodoNuevo = new nodo();
        nodoNuevo.dato = dato;
        if(primero == null){
        primero =  nodoNuevo;
        primero.siguiente = null; 
        ultimo = primero;
        
        }else{
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;
            
        
        
        
    }
        
    }
    
    public void verLista() {
    nodo actual = new nodo();
    actual = primero;
    while (actual != null) {
    System.out.print(actual.dato);
    actual = actual.siguiente;
    
}
    
    

