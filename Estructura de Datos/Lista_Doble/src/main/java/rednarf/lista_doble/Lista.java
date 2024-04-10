
package rednarf.lista_doble;




public class Lista {
    private NodoD Head;
    private NodoD Tail;
    
    public void Insertar(int value){
        NodoD newnodo = new NodoD(value);
        if(Head==null && Tail==null){
            Head=newnodo;
            Head.setNext(Tail);
            Tail=newnodo;
            Tail.setBack(Head);
            this.update();
        }
        else{
            Tail.setNext(newnodo);
            newnodo.setBack(Tail);
            Tail=newnodo;
            this.update();
        }
    }
    
    public void Mostrar(){
        if(Head!=null){
        NodoD Presente = Head;
        int contador=1;
        do{
            System.out.println("["+contador+"] " + Presente.getValue());
            Presente=Presente.getNext();
            contador ++;
        }while(Presente!=Head);
        }
    }
    
    
    public void EliminarIndex(int ID){
        NodoD Presente = Head;
        NodoD Anterior= Head.getBack();
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
                   System.out.println("Valor en el indice [" + ID + "] : " + Valor + " Eliminado");
                    Tail=Anterior;
                    Presente=null;
                    this.update();
                }
                else{
                    System.out.println("Valor en el indice [" + ID + "] : " + Valor + " Eliminado");
                    Anterior.setNext(Presente.getNext());
                    Presente=null;
                    this.update();
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
            this.update();
        }
        else{
            System.out.println("Se ingresó un indice no valido");
        }
    }
    
    public void update(){
        Head.setBack(Tail);
        Tail.setNext(Head);
    }
}
