
package rednarf.lista_circular;




public class Lista {
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
