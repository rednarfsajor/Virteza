
package Clases;
import java.io.*;
import java.util.*;
import javax.swing.*;

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
        if(!validation(carro.getPlaca())){
            if(Head ==  null){
            Head=newnodo;
        }
        else{
            if(Head.getNext()==null){
                Tail=newnodo;
                Tail.setBack(Head);
                Head.setNext(Tail);
            }
            else{
                if("DISPONIBLE".equals(carro.getStatus())){
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
        }
        else{
            JOptionPane.showMessageDialog(null, "Vehiculo ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    private boolean validation(String placa){
        Nodo_Vehiculo Presente=Head;
        if(Head!=null){
        while(Presente!=null){
            if(placa.equals(Presente.getCarro().getPlaca())){
                return true;
            }
            else{
                Presente=Presente.getNext();
            }
        }
    }
        return false;
    }
    //Modificar vehiculo
    public void modificar (Vehiculo carro){
        Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        if(Head!=null){
        while(Presente!=null && !encontrado){
            if(carro.getPlaca().equals(Presente.getCarro().getPlaca())){
                
                Presente.setCarro(carro);
                
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
    public void eliminar (Vehiculo carro){
        String placa=carro.getPlaca();
        if("DISPONIBLE".equals(carro.getStatus())){
            Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        if(Head!=null){
        while(Presente!=null){
            if(placa.equals(Presente.getCarro().getPlaca())){
                if(Presente==Head){
                    try{
                        Head=Head.getNext();
                        Head.setBack(null);
                    }
                    catch(NullPointerException ex){
                        Head=null;
                    }
                }
                else if(Presente==Tail){
                    try{
                        Tail=Tail.getBack();
                        Tail.setNext(null);
                    }
                    catch(NullPointerException ex){
                        Tail=null;
                    }
                    
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
        else{
            JOptionPane.showMessageDialog(null,"El auto no se puede eliminar porque no esta disponible!", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    //Leer vehiculo
    public String buscar(String placa){
        Nodo_Vehiculo Presente=Head;
        boolean encontrado=false;
        String datos="\n";
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
                        int can2=General.Alquileres_Registrados.cantidad(aux.getCarro());
                        while(!fin){
                            int can1=General.Alquileres_Registrados.cantidad(top.get(pepe));
                            
                            if(can2>can1){
                                if(top.size()==5){
                                    for(int i=4;i>=pepe;i--){
                                        if(i>pepe){
                                             top.set(i, top.get(i-1));
                                        }
                                        else{
                                            top.set(i, aux);
                                        }
                                    }
                                }
                                else{
                                    for(int i=top.size()-1;i>=pepe;i--){
                                        if(i==top.size()-1){
                                                top.add(top.get(i));
                                            }
                                        if(i>pepe){
                                            
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
                                if(pepe==top.size()){
                                    fin=true;
                                    if(pepe<4){
                                        top.add(aux);
                                    }
                                }
                            }
                        }
                        return top;
        }
        
        public void Guardar(){
            try{
            FileWriter fw=new FileWriter("Vehiculos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            Nodo_Vehiculo nodo = Head;
            
            while(nodo!=null){
                String datos="";
                Vehiculo carro = nodo.getCarro();
                datos+=carro.getPlaca()+"\n"
                        +carro.getMarca()+"\n"
                        +carro.getModelo()+"\n"
                        +carro.getAño()+"\n"
                        +carro.getColor()+"\n"
                        +carro.getCilindrada()+"\n"
                        +carro.getCombustible()+"\n"
                        +carro.getCapacidad()+"\n"
                        +carro.getPrecio()+"\n"
                        +carro.getExtras()+"\n"
                        +carro.getStatus()+"\n";
            pw.println(datos);
            nodo=nodo.getNext();
            }
            pw.flush();
            pw.close();
            }
            catch(Exception E){
            
        }
        
        }
        
        public void Cargar(){
            try{
                 FileReader fr = new FileReader("Vehiculos.txt");
                 BufferedReader br = new BufferedReader(fr);
                 String texto="";
                 while(texto!=null){
                     String placa=br.readLine();
                     String marca=br.readLine(); 
                     String modelo=br.readLine(); 
                     int año=Integer.parseInt(br.readLine());
                     String color=br.readLine(); 
                     int cilindrada=Integer.parseInt(br.readLine());
                     String combustible=br.readLine(); 
                     int capacidad=Integer.parseInt(br.readLine()); 
                     double precio=Double.parseDouble(br.readLine());
                     String extras=br.readLine();
                     String estatus = br.readLine();
                     Vehiculo carro = new Vehiculo(placa,marca,modelo,año,color,cilindrada,combustible,capacidad,precio,extras,estatus);
                     this.insertar(carro);
                     texto=br.readLine();
                 }
            }
            catch(Exception E){
                
            }
           
        }
        }
    
    

    
