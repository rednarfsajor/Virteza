
package grupo4.proyecto_avance;


public class Vehiculos {
    private Nodo_Vehiculo Head;
    private Nodo_Vehiculo Tail;

    public Nodo_Vehiculo getHead() {
        return Head;
    }

    public Nodo_Vehiculo getTail() {
        return Tail;
    }

    public void setHead(Nodo_Vehiculo Head) {
        this.Head = Head;
    }

    public void setTail(Nodo_Vehiculo Tail) {
        this.Tail = Tail;
    }
    
    //Insertar/crear vehiculo
    public void insertar(Vehiculo carro){
        Nodo_Vehiculo newnodo = new Nodo_Vehiculo(carro);
        if(Head ==  null){
            Head=newnodo;
            Tail=newnodo;
            Head.setNext(Tail);
            Tail.setBack(Head);
        }
        else{
            if(carro.getStatus()=='D'){
                Nodo_Vehiculo aux=Head;
                aux.setBack(newnodo);
                newnodo.setNext(aux);
                Head=newnodo;
            }
            else{
                Nodo_Vehiculo aux=Tail;
                aux.setNext(newnodo);
                newnodo.setBack(aux);
                Tail=newnodo;
                    }
        }
    }
    
    //Modificar vehiculo
    public void modificar (Vehiculo carro){
        Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        if(Head!=null){
        while(Presente!=null){
            if(carro.getPlaca().equals(Presente.getCarro().getPlaca())){
                Nodo_Vehiculo newnodo = new Nodo_Vehiculo(carro);
                newnodo.setNext(Presente.getNext());
               Presente.getBack().setNext(newnodo);
                Presente=null;
                encontrado=true;
            }
            else{
                Presente=Presente.getNext();
            }
                if(!encontrado){
                //No se encontró vehiculo
            }
            else{
                //Vehiculo encontrado y modificado
            }
            }
        }
    }
    
    //Eliminar vehiculo
    public void eliminar (String placa){
        Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        if(Head!=null){
        while(Presente!=null){
            if(placa.equals(Presente.getCarro().getPlaca())){
                Presente.getBack().setNext(Presente.getNext());
                Presente.getNext().setBack(Presente.getBack());
                Presente=null;
                encontrado=true;
            }
            else{
                Presente=Presente.getNext();
            }
            if(!encontrado){
                //No se encontró vehiculo
            }
            else{
                //Vehiculo encontrado y eliminado
            }
                
            }
        }
    }
    //Leer vehiculo
    public String buscar(String placa){
        Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        String datos="DATOS DE AUTO\n";
        if(Head!=null){
        while(Presente!=null){
            if(placa.equals(Presente.getCarro().getPlaca())){
                Vehiculo carro = Presente.getCarro();
                datos+="\nEstado: ["+carro.getStatus()+"]\n"
                    + "Placa: [" + carro.getPlaca() + "]\n"
                    + "Marca: [" + carro.getMarca() + "]\n"
                    + "Modelo: "+carro.getModelo() + "]\n"
                    + "Año: [" + carro.getAño()+"]\n"
                    + "Color: [" + carro.getColor() + "]\n"
                    + "Cilindrada: ["+carro.getCilindrada()+"]\n"
                    + "Combustible: ["+carro.getCombustible()+"]\n"
                    + "Capacidad: ["+carro.getCapacidad()+"]\n"
                    + "Precio: ["+carro.getPrecio()+"]\n"
                    + "Extras: ["+carro.getExtras()+"]\n"
                    +"-----------------------------------------------------------------";
                Presente=null;
                encontrado=true;
            }
            else{
                Presente=Presente.getNext();
            }
            if(!encontrado){
                datos="Vehiculo no encontrado";
            }
                
            }
        }
        return datos;
    }
    
    public String mostrar(){
        Nodo_Vehiculo Presente =Head;
        String datos="\nDATOS DE VEHICULOS\n";
        if(Head!=null){
        while(Presente!=null){
            Vehiculo carro = Presente.getCarro();
            datos+="\nEstado: ["+carro.getStatus()+"]\n"
                    + "Placa: [" + carro.getPlaca() + "]\n"
                    + "Marca: [" + carro.getMarca() + "]\n"
                    + "Modelo: "+carro.getModelo() + "]\n"
                    + "Año: [" + carro.getAño()+"]\n"
                    + "Color: [" + carro.getColor() + "]\n"
                    + "Cilindrada: ["+carro.getCilindrada()+"]\n"
                    + "Combustible: ["+carro.getCombustible()+"]\n"
                    + "Capacidad: ["+carro.getCapacidad()+"]\n"
                    + "Precio: ["+carro.getPrecio()+"]\n"
                    + "Extras: ["+carro.getExtras()+"]\n"
                    +"-----------------------------------------------------------------";
            Presente=Presente.getNext();
        }
        }
        return datos;
    }
        
    }
    
    

    
