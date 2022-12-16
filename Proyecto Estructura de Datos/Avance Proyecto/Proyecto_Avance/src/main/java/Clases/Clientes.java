
package Clases;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Clientes {
    private Nodo_Cliente Root;

    public Nodo_Cliente getRoot() {
        return Root;
    }

    public void setRoot(Nodo_Cliente Root) {
        this.Root = Root;
    }

    
    public void insertar(Cliente persona){
        Nodo_Cliente newnodo = new Nodo_Cliente(persona);
        if(!validation(persona.getCédula())){
            if(Root==null){
            Root=newnodo;
        }
        else{
            inserta(Root,persona);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Cliente ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
     private void inserta(Nodo_Cliente node, Cliente value){
        Nodo_Cliente newnodo = new Nodo_Cliente(value);
        if(value.getCédula()<=node.getPersona().getCédula()){
            if(node.getL()==null){
                node.setL(newnodo);
            }
            else{
                inserta(node.getL(),value);
            }  
        }
        else{
            if(node.getR()==null){
                node.setR(newnodo);
            }
            else{
                inserta(node.getR(),value);
            }
        }
    }
     
     private boolean validation(int cedula){
          Nodo_Cliente node=Root;
        while(node!=null){
            int ced=node.getPersona().getCédula();
            if(cedula>ced){
            node=node.getR();
        }
        else if(cedula<ced){
            node=node.getL();
        }
        else if(cedula==ced){
            return true;
        }
        }
        return false;
     }
   public String  mostrar(){
       String datos="";
       ArrayList<Nodo_Cliente> Clientes=new ArrayList(); 
        if(Root != null){
            Clientes=inordenrecorrer(Root,Clientes);
            for(Nodo_Cliente node:Clientes){
                datos+="\nCédula: ["+node.getPersona().getCédula()+"]\n"
                    +"Nombre Completo: ["+ node.getPersona().getNombre_Completo()+"]\n"
                    +"Fecha de Nacimiento: ["+ node.getPersona().getFecha()+"]\n"
                    +"Correo Electrónico: ["+ node.getPersona().getCorreo()+"]\n"
                    +"Categoría: ["+ node.getPersona().getCategoria()+"]\n"
                    +"---------------------------------------------------------------------------------\n";
            }
        }
        else{
            System.out.println("Arbol vacio");
        }
        return "DATOS DE CLIENTES\n" + datos;
            }
    
    private ArrayList<Nodo_Cliente> inordenrecorrer(Nodo_Cliente node, ArrayList<Nodo_Cliente> clientes){
        
        if(node!=null){
            clientes=inordenrecorrer(node.getL(),clientes);
            clientes.add(node);
            clientes=inordenrecorrer(node.getR(),clientes);
            return clientes;
        }
        else{
            return clientes;
        }
        
    }
    
    public Cliente getPersona(int cedula){
        Nodo_Cliente node=Root;
        while(node!=null){
            int ced=node.getPersona().getCédula();
            if(cedula>ced){
            node=node.getR();
        }
        else if(cedula<ced){
            node=node.getL();
        }
        else if(cedula==ced){
            return node.getPersona();
        }
        }
        return null;
    }
    
    public String printPersona(Cliente humano){
        String datos="";
        datos+="\nCédula: ["+humano.getCédula()+"]\n"
                    +"Nombre Completo: ["+ humano.getNombre_Completo()+"]\n"
                    +"Fecha de Nacimiento: ["+ humano.getFecha()+"]\n"
                    +"Correo Electrónico: ["+ humano.getCorreo()+"]\n"
                    +"Categoría: ["+ humano.getCategoria()+"]\n\n";
        return datos;
    }
    
    public void modificar(Cliente persona){
        int cedula=persona.getCédula();
        
        Nodo_Cliente node=Root;
        while(node!=null){
            int ced=node.getPersona().getCédula();
            if(cedula>ced){
            node=node.getR();
        }
        else if(cedula<ced){
            node=node.getL();
        }
        else if(cedula==ced){
            node.setPersona(persona);
            break;
        }
        }
        
         
        
    }
    
    
    public void eliminar(Cliente Humano){
         if(Root!=null){
                if(!General.Alquileres_Registrados.pendiente(Humano.getCédula())){
                    Nodo_Cliente aux;
                ArrayList<Cliente> Clientes=new ArrayList();
                aux=getNodo(Humano);
                Clientes=eliminados(aux,Clientes);
                Clientes.remove(Clientes.size()-1);
                for(Cliente item:Clientes){
                    General.Clientes_Registrados.insertar(item);
                }
                }
                else{
                    JOptionPane.showMessageDialog(null,"El cliente aún tiene alquileres pendientes!", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
                
         }
    }
    private void delete(int cedula){
        if(Root.getPersona().getCédula()==cedula){
            Root=null;
        }
        else{
            Nodo_Cliente node=Root;
        boolean fin=false;
        while(!fin && node!=null){
            int ced=node.getPersona().getCédula();
            if(cedula>ced){
                if(node.getR().getPersona().getCédula()==cedula){
                    node.setR(null);
                    fin=true;
                }
                else{
                    node=node.getR();
                }
            
        }
        else if(cedula<ced){
            
            if(node.getL().getPersona().getCédula()==cedula){
                    node.setL(null);
                    fin=true;
                }
            else{
                node=node.getL();
            }
            
        }
        }
        }
        
    }
    private ArrayList<Cliente> eliminados(Nodo_Cliente node, ArrayList<Cliente> lista){
        if(node!=null){
            lista=eliminados(node.getL(),lista);
           
            lista=eliminados(node.getR(),lista);
            lista.add(node.getPersona());
            this.delete(node.getPersona().getCédula());
            return lista;
        }
        else{
            return lista;
        }
            
    }
    private Nodo_Cliente getNodo(Cliente Humano){
        Nodo_Cliente node = Root;
        int cedula = Humano.getCédula();
        while(node!=null){
            int ced=node.getPersona().getCédula();
            if(cedula>ced){
            node=node.getR();
        }
        else if(cedula<ced){
            node=node.getL();
        }
        else if(cedula==ced){
            return node;
        }
        }
        return null;
    }
    
    
    public void Guardar(){
         try{
            FileWriter fw=new FileWriter("Clientes.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            ArrayList<Nodo_Cliente> Clientes = new ArrayList();
            String datos="";
            datos+=Root.getPersona().getCédula()+"\n"
                    +Root.getPersona().getNombre_Completo()+"\n"
                    +Root.getPersona().getFecha()+"\n"
                    +Root.getPersona().getCorreo()+"\n"
                    +Root.getPersona().getCategoria()+"\n";
            pw.println(datos);
            Clientes=inordenrecorrer(Root.getR(),Clientes);
            for(Nodo_Cliente item:Clientes){
                datos="";
                datos+=item.getPersona().getCédula()+"\n"
                    +item.getPersona().getNombre_Completo()+"\n"
                    +item.getPersona().getFecha()+"\n"
                    +item.getPersona().getCorreo()+"\n"
                    +item.getPersona().getCategoria()+"\n";
                 pw.println(datos);
            }
            
            Clientes=inordenrecorrer(Root.getL(),Clientes);
            for(Nodo_Cliente item:Clientes){
                datos="";
                datos+=item.getPersona().getCédula()+"\n"
                    +item.getPersona().getNombre_Completo()+"\n"
                    +item.getPersona().getFecha()+"\n"
                    +item.getPersona().getCorreo()+"\n"
                    +item.getPersona().getCategoria()+"\n";
                 pw.println(datos);
            }
            pw.flush();
            pw.close();
            }
            catch(Exception E){
            
        }
        
    }
    
    public void Cargar(){
         try{
                 FileReader fr = new FileReader("Clientes.txt");
                 BufferedReader br = new BufferedReader(fr);
                 String texto="";
                 while(texto!=null){
                     int cédula=Integer.parseInt(br.readLine()); 
                     String Nombre_Completo=br.readLine();
                     String fecha=br.readLine();
                     String correo=br.readLine(); 
                     String categoria=br.readLine();
                     Cliente humano = new Cliente(cédula,Nombre_Completo,fecha,correo,categoria);
                     this.insertar(humano);
                     texto=br.readLine();
                 }
            }
            catch(Exception E){
                
            }
    }
    
    public ArrayList<Nodo_Cliente> top5(){
        ArrayList<Nodo_Cliente> top = new ArrayList();
        ArrayList<Nodo_Cliente> Clientes = new ArrayList();
            if(Root!=null){
                Clientes=inordenrecorrer(Root,Clientes);
                for(Nodo_Cliente aux:Clientes){
                     top=comparar(aux,top);
                }
            }
            else{
                top=null;
            }
            return top;
    }
    
     private ArrayList<Nodo_Cliente> comparar(Nodo_Cliente aux,ArrayList<Nodo_Cliente> top){
                        if(top.isEmpty()){
                            top.add(aux);
                        }
                        else{
                            boolean fin=false;
                        int pepe=0;
                        int can2=General.Alquileres_Registrados.cantidad(aux.getPersona());
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
                                    for(int i=top.size()-1;i>pepe;i--){
                                        if(i>pepe){
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
                        }
                        
                        return top;
        }
}
