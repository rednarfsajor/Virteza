
package Clases;
import java.util.*;
import java.io.*;

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
    
    public void modificar(String ID, String estatus){
        Nodo_Alquiler aux = Head;
        boolean modificado = false;
        if(Head!=null){
            while(aux!=null & !modificado){
                if(aux.getPrestamo().getID().equals(ID)){
                    aux.getPrestamo().setEstado(estatus);
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
    public String mostrar(){
        String datos="";
        if(Head!=null){
            Nodo_Alquiler aux=Head;
            while(aux!=null){
                Alquiler a=aux.getPrestamo();
                datos+="\nID: ["+a.getID()+"]\n"
                        +"Cliente: [" + a.getPersona().getNombre_Completo() +"]\n"
                        +"Vehiculo: [" + a.getCarro().getPlaca()+"]\n"
                        +"Días de Alquiler: ["+a.getDias()+"]\n"
                        +"Estado de Alquiler:  "+ a.getEstado()+"]\n"
                        +"Precio a Paga: ["+a.getMonto()+"]\n"
                        +"Fecha: ["+a.getFecha()+"]\n"
                        +"---------------------------------------------------------------------";
                aux=aux.getNext();
            }
        }
        else{
            datos="No hay alquileres registrados";
        }
        return datos;
    }
   public Nodo_Alquiler buscar(String ID){
        Nodo_Alquiler aux;
        boolean encontrado = false;
        if(Head!=null){
            aux = Head;
            while(aux!=null & !encontrado){
                if(aux.getPrestamo().getID().equals(ID)){
                    return aux;
                }
                else{
                    aux=aux.getNext();
                }
            }
        }
        else{
            aux=null;
        }
        return aux;
    }
   
   public Alquiler devolucion(int ced, String placa){
       if(Head!=null){
           Nodo_Alquiler aux=Head;
           while(aux!=null){
               if(aux.getPrestamo().getPersona().getCédula()==ced && placa.equals(aux.getPrestamo().getCarro().getPlaca()) &&"PROCESADO".equals(aux.getPrestamo().getEstado())){
                   return aux.getPrestamo();
               }
               else{
                   aux=aux.getNext();
               }
           }
           return null;
       }
       else{
            return null;
       }
       
   }
   
   
   public int cantidad(Object object){
           int pepe=0; //Contador
           if(Head!=null){
               Nodo_Alquiler aux = Head;
               while(aux!=null){
                   if(aux.getPrestamo().getCarro()==object || aux.getPrestamo().getPersona()==object){
                       pepe+=1;
                   }
                   aux=aux.getNext();
               }
           }
           
           return pepe;
       }
   
   
   public void montopromedio(){
       if(Head!=null){
           ArrayList<Double> montos=new ArrayList();
            ArrayList<Double> promedios=new ArrayList();
            ArrayList<String> categorias=new ArrayList();
            categorias.add("ZAFIRO");
            categorias.add("ORO");
            categorias.add("PLATA");
            categorias.add("BRONCE");
            Interfaz.Estadisticas.Categorias=categorias;
        for(String item:categorias){
            double monto=0.000;
            double promedio=0.000;
            Nodo_Alquiler aux=Head;
            while(aux!=null){
                if(aux.getPrestamo().getPersona().getCategoria().equals(item)){
                    monto+=aux.getPrestamo().getMonto();
                    promedio+=1;
                }
                aux=aux.getNext();
            }
            promedio=monto/promedio;
            montos.add(monto);
            promedios.add(promedio);
        }
        Interfaz.Estadisticas.Montos=montos;
        Interfaz.Estadisticas.Promedios=promedios;
        
       }
        
   }
   
   public String TodosDe(int cedula){
       String datos="\nALQUILERES\n";
        if(Head!=null){
           Nodo_Alquiler aux=Head;
           while(aux!=null){
               Alquiler a=aux.getPrestamo();
               if(a.getPersona().getCédula()==cedula){
                   datos+="\nID: ["+a.getID()+"]\n"
                        +"Cliente: [" + a.getPersona().getNombre_Completo() +"]\n"
                        +"Vehiculo: [" + a.getCarro().getPlaca()+"]\n"
                        +"Días de Alquiler: ["+a.getDias()+"]\n"
                        +"Estado de Alquiler:  "+ a.getEstado()+"]\n"
                        +"Precio a Paga: ["+a.getMonto()+"]\n"
                        +"Fecha: ["+a.getFecha()+"]\n"
                        +"---------------------------------------------------------------------";
                   
               }
               
                   aux=aux.getNext();
               
           }
       }
       return datos;
   }
   
   public boolean pendiente(int cedula){
        if(Head!=null){
           Nodo_Alquiler aux=Head;
           while(aux!=null){
               Alquiler a=aux.getPrestamo();
               if(a.getPersona().getCédula()==cedula && !"FINALIZADO".equals(a.getEstado())){
                   return true;
               }
               
                   aux=aux.getNext();
               
           }
       }
        return false;
   }
   
   public void Guardar(){
        try{
            FileWriter fw=new FileWriter("Alquileres.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            Nodo_Alquiler nodo = Head;
            
            while(nodo!=null){
                String datos="";
                Alquiler a = nodo.getPrestamo();
                datos+=a.getID()+"\n"
                        +a.getPersona().getCédula()+"\n"
                    +a.getPersona().getNombre_Completo()+"\n"
                    +a.getPersona().getFecha()+"\n"
                    +a.getPersona().getCorreo()+"\n"
                    +a.getPersona().getCategoria()+"\n"
                        +a.getCarro().getPlaca()+"\n"
                        +a.getCarro().getMarca()+"\n"
                        +a.getCarro().getModelo()+"\n"
                        +a.getCarro().getAño()+"\n"
                        +a.getCarro().getColor()+"\n"
                        +a.getCarro().getCilindrada()+"\n"
                        +a.getCarro().getCombustible()+"\n"
                        +a.getCarro().getCapacidad()+"\n"
                        +a.getCarro().getPrecio()+"\n"
                        +a.getCarro().getExtras()+"\n"
                        +a.getCarro().getStatus()+"\n"
                        +a.getDias()+"\n"
                        +a.getEstado()+"\n"
                        +a.getMonto()+"\n"
                        +a.getFecha()+"\n";
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
                 FileReader fr = new FileReader("Alquileres.txt");
                 BufferedReader br = new BufferedReader(fr);
                 String texto="";
                 while(texto!=null){
                    String ID=br.readLine();
                    int cédula=Integer.parseInt(br.readLine()); 
                     String Nombre_Completo=br.readLine();
                     String fecha=br.readLine();
                     String correo=br.readLine(); 
                     String categoria=br.readLine();
                     Cliente humano = new Cliente(cédula,Nombre_Completo,fecha,correo,categoria);
                    Cliente Persona=humano;
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
                    Vehiculo Carro=carro;
                    int Dias=Integer.parseInt(br.readLine());
                    String Estado=br.readLine();
                    double monto=Double.parseDouble(br.readLine());
                    String Fecha=br.readLine();
                     Alquiler alquiler = new Alquiler(ID,Persona,Carro,Dias,Estado,monto,Fecha);
                     this.Insertar(alquiler);
                     texto=br.readLine();
                 }
            }
            catch(Exception E){
                
            }
       
   }
}

