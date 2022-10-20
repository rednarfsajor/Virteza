
package grupo4.grupo4_prueba1;


public class Cola<T> {
    private Nodo<T> Head;
    private Nodo<T> Tail;
    
    public void AgregarOrden(Orden order){
        Nodo newnodo = new Nodo<Orden>(order);
        
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
    
    public void AtenderOrder(){
        if(Head==null){
            //Imprimo que ya no hay ordenes que atender
        }
        else{
            Nodo Aux=Head;
            Head=Head.getNext();
            
            Plato plato=new Plato();
        }
    }
}
