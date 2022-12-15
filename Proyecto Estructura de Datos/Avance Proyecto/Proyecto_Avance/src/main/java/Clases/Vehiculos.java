
package Clases;
import java.util.*;

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
        }
        else{
            if("DISPONIBLE".equals(carro.getStatus())){ //D de  disponible
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
        while(Presente!=null && !encontrado){
            if(carro.getPlaca().equals(Presente.getCarro().getPlaca())){
                //Nodo_Vehiculo newnodo = new Nodo_Vehiculo(carro);
                Presente.setCarro(carro);
                //newnodo.setNext(Presente.getNext());
               //Presente.getBack().setNext(newnodo);
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
                if(Presente==Head){
                    Head.getNext().setBack(null);
                    Head=Head.getNext();
                }
                else if(Presente==Tail){
                    Tail.getBack().setNext(null);
                    Tail=Tail.getBack();
                }
                else{
                    Presente.getBack().setNext(Presente.getNext());
                    Presente.getNext().setBack(Presente.getBack());
                }
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
        while(Presente!=null  && !encontrado){
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
        else{
            datos="NO HAY VEHICULOS";
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
        else{
            datos="NO HAY VEHICULOS";
        }
        return datos;
    }
        public Vehiculo getauto(String placa){
            Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        Vehiculo auto=null;
        if(Head!=null){
        while(Presente!=null  && !encontrado){
            if(placa.equals(Presente.getCarro().getPlaca())){
                auto=Presente.getCarro();
                encontrado=true;
            }
            else{
                Presente=Presente.getNext();
            }
            if(!encontrado){
                auto=null;
            }
                
            }
        }
        return auto;
        }
        
        public ArrayList<Nodo_Vehiculo> filtrar(String model, String branch, int year, int passage, Nodo_Vehiculo node, ArrayList<Nodo_Vehiculo> lista){
            if(node!=null){
                Vehiculo carro=node.getCarro();
                if("DISPONIBLE".equals(carro.getStatus())){
                    if(!carro.getModelo().equals(model)&&!carro.getMarca().equals(branch)&&carro.getAño()!=year&&carro.getCapacidad()!=passage){
                        filtrar(model,branch,year,passage,node.getNext(),lista);
                    }
                    else{
                        lista.add(node);
                        filtrar(model,branch,year,passage,node.getNext(), lista);
                    }
                }
                else{
                    filtrar(model,branch,year,passage,node.getNext(), lista);
                }
                    
            }
            return lista;
        }
        
        
        public ArrayList<Nodo_Vehiculo>Top5() {
            ArrayList<Nodo_Vehiculo> top = new ArrayList();
            if(Head!=null){
                Nodo_Vehiculo aux=Head;
                while(aux!=null){
                    if(top.isEmpty()){
                        top.add(aux);
                    }
                    else{
                        top=comparar(aux,top);
                    }
                    aux=aux.getNext();
                }
            }
            else{
                top=null;
            }
            
            
            
            
            
            
            return top;
        }
        private ArrayList<Nodo_Vehiculo> comparar(Nodo_Vehiculo aux,ArrayList<Nodo_Vehiculo> top){
                        boolean fin=false;
                        int pepe=0;
                        int can2=General.Alquileres_Registrados.cantidad(aux);
                        while(!fin){
                            int can1=General.Alquileres_Registrados.cantidad(top.get(pepe));
                            
                            if(can2>can1){
                                if(top.size()==5){
                                    for(int i=4;i>=top.indexOf(pepe);i--){
                                        if(i>top.indexOf(pepe)){
                                             top.set(i, top.get(i-1));
                                        }
                                        else{
                                            top.set(i, aux);
                                        }
                                    }
                                }
                                else{
                                    for(int i=top.size()-1;i>top.indexOf(pepe);i--){
                                        if(i>top.indexOf(pepe)){
                                            if(i==top.size()-1){
                                                top.add(top.get(i));
                                            }
                                                top.set(i, top.get(i-1));
                                        }
                                        else{
                                            top.set(i, aux);
                                        }
                                    }
                                }
                                fin=true;
                            }
                            else{
                                pepe+=1;
                                if(pepe>=top.size()){
                                    fin=true;
                                    if(pepe<5){
                                        top.add(aux);
                                    }
                                }
                            }
                        }
                        return top;
        }
    }
    
    

    
