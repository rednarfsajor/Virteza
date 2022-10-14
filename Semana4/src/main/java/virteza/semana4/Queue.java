
package virteza.semana4;


public class Queue<T> {
    private Node<T> Head;
    private Node<T> Tail;
    
    public  void  enqueue(T Value){
        Node<T> newNode = new Node<T>(Value);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }
        else{
            Tail.setNext(newNode);
            Tail=newNode;
        }
    }
    public Node<T> dequeue(){
        if(Head==null){
            System.out.println("La cola esta vacia");
            return null;
        }
        else{
            Node<T>Aux=Head;
            Head=Head.getNext();
            return Aux;
        }
    }
public static Queue LlenarN (int n, Queue Cola){
            for(int x=0;x<=n;x++){
                Cola.enqueue(x);
            }
            return Cola;
 }

public Node<T> FindByIndex(int index){
    Node<T> temp = Head;
    if(Head==null){
        System.out.println("Cola vacia");
        return null;
    }
    else{
        
        for(int x=0;x>=index;x++){
            if(temp.getNext()==null){
                return null;
            }
            else{
                temp=temp.getNext();
            }
           
        }
    }
    
   return temp;
}

    }
 
