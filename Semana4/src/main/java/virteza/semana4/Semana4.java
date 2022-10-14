
package virteza.semana4;


public class Semana4 {

    public static void main(String[] args) {
        Queue Cola = new Queue();
        Cola=Queue.LlenarN(20, Cola);
        for(int x=0;x>10;x++){
            System.out.println(Cola.dequeue().getValue());
        }
        System.out.println(Cola.FindByIndex(8).getValue());
    }
}
