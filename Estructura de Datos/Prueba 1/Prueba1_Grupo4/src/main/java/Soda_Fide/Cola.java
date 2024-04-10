/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soda_Fide;


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
                case "Casado Carne":
                    plato.setCubiertos(true);
                    break;
                case "Casado Pescado":
                    plato.setCubiertos(true);
                    break;
                case "Cantones":
                    plato.setCubiertos(false);
                    break;
                case "Pollo Frito":
                    plato.setCubiertos(false);
                    break;
                default:
                    plato.setCubiertos(false);
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
            txt="---------------------------\n[Nombre: "+nodo.getValue().getCliente()+"]\n[Cedula: "+String.valueOf(nodo.getValue().getCedula())+"]\n[Orden: "+nodo.getValue().getProducto()+"]\n[Total: "+String.valueOf(nodo.getValue().getTotal())+"]\n[Discapacidad: "+String.valueOf(nodo.getValue().isDiscapacidad())+"]\n"+txt;
            
            return txt;
        }
        else{
            return "\n";
        }
    }
}
