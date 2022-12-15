
package Clases;
import javax.swing.*;

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
            General.Vehiculos_Registrados.eliminar(aux.getPrestamo().getCarro().getPlaca());
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
                        +"---------------------------------------------------------------------";
                aux=aux.getNext();
            }
        }
        else{
            datos="No hay alquileres registrados";
        }
        return datos;
    }
}
