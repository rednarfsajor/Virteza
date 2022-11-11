
package grupo4.tarea_listas;


public class Lista_Circular {
    Nodo Head;
    Nodo Tail;
    
    public void Insertar(int value){
        Nodo newnodo = new Nodo(value);
        if(Head==null){
            Head=newnodo;
            Tail=newnodo;
            Tail.setNext(Head);
        }
        else{
            newnodo.setNext(Head);
            Head=newnodo;
            Tail.setNext(Head);
        }
    }
    
    public void LimpiarTail(int value){
        if(Tail.getValue()==value){
            
            Nodo aux=Head;
          while(aux.getNext()!=Tail){
              aux=aux.getNext();
          }
          Tail=aux;
          Tail.setNext(Head);
          System.out.println("Tail Eliminado");
          System.out.println("Nuevo Tail: " + Tail.getValue());
        }
        else{
            System.out.println("Tail no tiene el valor " + value);
        }
        
    }
}
