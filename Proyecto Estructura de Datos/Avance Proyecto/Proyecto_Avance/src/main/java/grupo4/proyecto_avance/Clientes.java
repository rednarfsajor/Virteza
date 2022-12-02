/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Clientes {
    private Nodo_Cliente Root;
    private int alt;

    public Nodo_Cliente getRoot() {
        return Root;
    }

    public int getAlt() {
        return alt;
    }

    public void setRoot(Nodo_Cliente Root) {
        this.Root = Root;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }
    
    public void insertar(Cliente persona){
        Nodo_Cliente newnodo = new Nodo_Cliente(persona);
        if(Root==null){
            Root=newnodo;
        }
        else{
            
        }
    }
    
    public void mostrar(){
        
    }
    
    public void buscar(){
        
    }
    
    public void modificar(){
        
    }
    
    public void eliminar(){
        
    }
}
