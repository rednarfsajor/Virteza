/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.proyecto_avance;

/**
 *
 * @author Rednarf
 */
public class Alquileres {
    private Nodo_Alquiler Head;

    public Nodo_Alquiler getHead() {
        return Head;
    }

    public void setHead(Nodo_Alquiler Head) {
        this.Head = Head;
    }
    
    public void Insertar(Alquiler alquiler){
        Nodo_Alquiler newnodo = new Nodo_Alquiler(alquiler);
        if(Head==null){
            Head=newnodo;
        }
        else{
            newnodo.setNext(Head);
            Head=newnodo;
        }
    }
    
    public void modificar(String ID){
        Nodo_Alquiler aux = Head;
        boolean modificado = false;
        if(Head!=null){
            while(aux!=null & !modificado){
                if(aux.getPrestamo().getID().equals(ID)){
                    aux.getPrestamo().setEstado("PROCESADO");
                    modificado = true;
                }
                else{
                    aux=aux.getNext();
                }
            }
            if(modificado){
                //ALQUILER PROCESADO Y ACTUALIZADO
            }
            else{
                //ERROR
            }
        }
    }
    
   
}
