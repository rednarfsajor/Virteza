
package Clases;


public class Alquileres {
    private Nodo_Alquiler Head;

    public Nodo_Alquiler getHead() {
        return Head;
    }

    public void setHead(Nodo_Alquiler Head) {
        this.Head = Head;
    }
    
    public void Insertar(Alquiler alquiler){
        Nodo_Alquiler newnodo = new Nodo_Alquiler(alquiler);
        if(Head==null){
            Head=newnodo;
        }
        else{
            newnodo.setNext(Head);
            Head=newnodo;
        }
        if(alquiler.getDias()>=30){
            switch(alquiler.getPersona().getCategoria()){
                case "BRONCE":
                        alquiler.getPersona().setCategoria("PLATA");
                    break;
                case "PLATA":
                    alquiler.getPersona().setCategoria("ORO");
                    
                    break;
                case "ORO":
                    alquiler.getPersona().setCategoria("ZAFIRO");
                    break;
                default:
                    
                    break;
            }
            
            
        }
    }
    
    public void modificar(String ID){
        Nodo_Alquiler aux = Head;
        boolean modificado = false;
        if(Head!=null){
            while(aux!=null & !modificado){
                if(aux.getPrestamo().getID().equals(ID)){
                    aux.getPrestamo().setEstado("PROCESADO");
                    modificado = true;
                }
                else{
                    aux=aux.getNext();
                }
            }
            if(modificado){
                //ALQUILER PROCESADO Y ACTUALIZADO
            }
            else{
                //ERROR
            }
        }
    }
    
   
}
