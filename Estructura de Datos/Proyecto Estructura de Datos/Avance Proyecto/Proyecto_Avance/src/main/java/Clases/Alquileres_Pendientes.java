
package Clases;
import javax.swing.*;
import java.io.*;

public class Alquileres_Pendientes {
    private Nodo_Alquiler Head;
    private Nodo_Alquiler Tail;

    public Nodo_Alquiler getHead() {
        return Head;
    }

    public Nodo_Alquiler getTail() {
        return Tail;
    }

    public void setHead(Nodo_Alquiler Head) {
        this.Head = Head;
    }

    public void setTail(Nodo_Alquiler Tail) {
        this.Tail = Tail;
    }
    
    public void insertar(Alquiler prestamo){
        Nodo_Alquiler newnodo = new Nodo_Alquiler(prestamo);
        if(Head==null){
            Head=newnodo;
            Tail=newnodo;
        }
        else{
           switch(prestamo.getPersona().getCategoria()){
               case "ZAFIRO":
                   encontrar("ORO", "PLATA", "BRONCE",newnodo);
                   break;
               case "ORO":
                   encontrar("PLATA","BRONCE","",newnodo);
                   break;
               case "PLATA":
                   encontrar("BRONCE","","",newnodo);
                   break;
              default:
                   Nodo_Alquiler aux=Tail;
                   aux.setNext(newnodo);
                   Tail=newnodo;
                   break;
           }
            
        }
        
    }
    
    private void encontrar(String tipo1,String tipo2, String tipo3,Nodo_Alquiler nodo){
        Nodo_Alquiler aux=Head;
        Nodo_Alquiler anterior=Head;
        while(aux!=null){
            if(aux.getPrestamo().getPersona().getCategoria().equals(tipo1)||aux.getPrestamo().getPersona().getCategoria().equals(tipo2)||aux.getPrestamo().getPersona().getCategoria().equals(tipo3)){
                anterior.setNext(nodo);
                nodo.setNext(aux);
            }
            else{
                anterior=nodo;
                nodo=nodo.getNext();
            }
        }
        if(aux==null){
           anterior.setNext(nodo);
           Tail=nodo;
        }
    }
    public void atender(){
        if(Head!=null){
            Nodo_Alquiler aux=Head;
            Head=Head.getNext();
            General.Alquileres_Registrados.modificar(aux.getPrestamo().getID(),"PROCESADO");
            JOptionPane.showMessageDialog(null, "Alquiler " + aux.getPrestamo().getID() + " Procesado con exito!");
            General.Vehiculos_Registrados.eliminar(aux.getPrestamo().getCarro());
            aux.getPrestamo().getCarro().setStatus("ALQUILADO");
            General.Vehiculos_Registrados.insertar(aux.getPrestamo().getCarro());
        }
        else{
           JOptionPane.showMessageDialog(null, "No hay alquileres pendientes");
        }
    }
    //public Alquiler(Cliente Persona, Vehiculo Carro, int Dias, String Estado, double monto)
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
    public void Guardar(){
        try{
            FileWriter fw=new FileWriter("AlquileresP.txt");
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
                 FileReader fr = new FileReader("AlquileresP.txt");
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
                     this.insertar(alquiler);
                     texto=br.readLine();
                 }
            }
            catch(Exception E){
                
            }
       
   }
}
