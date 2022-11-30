
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
    
    public void EliminarIndex(int ID){
        Nodo Presente = Head;
        Nodo Anterior= Head;
        int Valor=0;
        boolean aux=false;
        if(ID>1){
            for(int i=0;i<ID;i++){
                Valor=Presente.getValue();
                if(Presente!=Tail && i!=ID-1){
                    Anterior=Presente;
                    Presente=Presente.getNext();
                }
                else if(i!=ID-1){
                    aux=true;
                }
             }
            if(!aux){
                
                
                if(Presente==Tail){
                    System.out.println("Valor Tail : " + Valor + " Eliminado");
                    System.out.println("Nuevo Tail : " + Anterior.getValue());
                    Tail=Anterior;
                    Presente=null;
                    Tail.setNext(Head);
                }
                else{
                    System.out.println("Valor en el indice [" + ID + "] : " + Valor + " Eliminado");
                    Anterior.setNext(Presente.getNext());
                    Presente=null;
                    Tail.setNext(Head);
                }
                
            }
            else{
                System.out.println("No existe valor en el indice ingresado");
            }
            
        }
        else if(ID==1){
            Valor=Head.getValue();
            System.out.println("Valor en el indice [" + ID + "] : " + Valor + " Eliminado");
            System.out.println("El nuevo Head es: " + Head.getNext().getValue());
            Head=Head.getNext();
            Tail.setNext(Head);
        }
        else{
            System.out.println("Se ingresó un indice no valido");
        }
    }
    public void Mostrar(){
        if(Head!=null){
        Nodo Presente = Head;
        int contador=1;
        do{
            System.out.println("["+contador+"] " + Presente.getValue());
            Presente=Presente.getNext();
            contador ++;
        }while(Presente!=Head);
        }
    }
}