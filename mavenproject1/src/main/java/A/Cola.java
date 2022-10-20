/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Cola {

    public Nodo getHead() {
        return Head;
    }

    public Nodo getTail() {
        return Tail;
    }
    private Nodo Head;
    private Nodo Tail;

    public Cola() {
    }
    
    public void AgregarOrden(Orden order){
        Nodo newnodo = new Nodo(order);
        
        if(Head==null){
            Head=newnodo;
            Tail=newnodo;
            newnodo.setNext(null);
        }
        else{
            if(order.isDiscapacidad()){
                newnodo.setNext(Head);
                Head=newnodo;
            }
            else{
                Tail.setNext(newnodo);
                Tail=newnodo;
                newnodo.setNext(null);
            }
        }
    }
    
    public Nodo AtenderOrder(){
        if(Head==null){
            return null;
        }
        else{
            Nodo Aux=Head;
            Head=Head.getNext();
            Plato plato = new Plato();
            switch(Aux.getValue().getProducto()){
                case 1:
                    plato.setCubiertos(true);
                    break;
                case 2:
                    plato.setCubiertos(true);
                    break;
                case 3:
                    plato.setCubiertos(false);
                    break;
                default:
                    plato.setCubiertos(true);
                    break;
            }
            General.Platos.ApilarPlato(plato);
            return Aux;
        }
    }
    
    public String Mostrar(){
        String TODO="";
        TODO=Mostrar_Apartir(Head,TODO);
        
        return TODO;
    }
    
    public static String Mostrar_Apartir(Nodo nodo, String txt){
        if(nodo!=null){
            txt=Mostrar_Apartir(nodo.getNext(),txt)+txt;
            txt="\n["+nodo.getValue().getCliente()+"]["+String.valueOf(nodo.getValue().getCedula())+"]["+String.valueOf(nodo.getValue().getProducto())+"]["+String.valueOf(nodo.getValue().getTotal())+"]["+String.valueOf(nodo.getValue().isDiscapacidad())+"]"+txt;
            
            return txt;
        }
        else{
            return "\n";
        }
    }
}
