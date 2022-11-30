
package grupo4.tarea_listas;

public class Lista_Simple {
    private Nodo Head;

    public Nodo getHead() {
        return Head;
    }

    public void setHead(Nodo Head) {
        this.Head = Head;
    }
    
    public void Insertar(int value){
        Nodo newnodo = new Nodo(value);
        if(Head==null){
            Head=newnodo;
        }
        else{
            newnodo.setNext(Head);
            Head=newnodo;
        }
        
        
    }
    
    public void Buscar(int ID){
        if(Head!=null){
            Nodo Presente = Head;
            Nodo Anterior= Head;
            int Valor=0;
            int Pre_Valor=0;
            boolean aux=false;
            if(ID>1){
                for(int i=0;i<ID;i++){
                    Valor=Presente.getValue();
                    Pre_Valor=Anterior.getValue();
                    if(Presente.getNext()!=null){
                        Anterior=Presente;
                        Presente=Presente.getNext();
                    }
                    else if(i!=ID-1){
                        aux=true;
                    }
                 }
                if(!aux){
                    System.out.println("Valor en el indice [" + ID + "] : " + Valor);
                    System.out.println("Valor anterior: " + Pre_Valor);
                }
                else{
                    System.out.println("No existe valor en el indice ingresado");
                }

            }
            else if(ID==1){
                Valor=Head.getValue();
                System.out.println("Valor en el indice [" + ID + "] : " + Valor);
                System.out.println("Valor anterior: No existe dado que el elemento seleccionado es el primer elemento de la lista");
            }
            else{
                System.out.println("Se ingresó un indice no valido");
            }
    }
    }
    public void EliminarIndex(int ID){
        if(Head!=null){
            Nodo Presente = Head;
            Nodo Anterior= Head;
            int Valor=0;
            boolean aux=false;
            if(ID>1){
                for(int i=0;i<ID;i++){
                    Valor=Presente.getValue();
                    if(Presente.getNext()!=null && i!=ID-1){
                        Anterior=Presente;
                        Presente=Presente.getNext();
                    }
                    else if(i!=ID-1){
                        aux=true;
                    }
                 }
                if(!aux){
                    System.out.println("Valor en el indice [" + ID + "] : " + Valor + " Eliminado");
                    Anterior.setNext(Presente.getNext());
                    Presente.setNext(null);
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
            }
            else{
                System.out.println("Se ingresó un indice no valido");
            }
    }
    }
    
    public void Mostrar(){
        if(Head!=null){
        Nodo Presente = Head;
        int contador=1;
        while(Presente!=null){
            System.out.println("["+contador+"] " + Presente.getValue());
            Presente=Presente.getNext();
            contador ++;
        }
        }
    }
}
