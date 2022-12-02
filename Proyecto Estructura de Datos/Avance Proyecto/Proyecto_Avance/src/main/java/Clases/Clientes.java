
package Clases;


public class Clientes {
    private Nodo_Cliente Root;
    private int alt;

    public Nodo_Cliente getRoot() {
        return Root;
    }

    public int getAlt() {
        return alt;
    }

    public void setRoot(Nodo_Cliente Root) {
        this.Root = Root;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }
    
    public void insertar(Cliente persona){
        Nodo_Cliente newnodo = new Nodo_Cliente(persona);
        if(Root==null){
            Root=newnodo;
        }
        else{
            inserta(Root,persona);
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
   public String  inorden(){
       String datos="";
        if(Root != null){
            datos=inordenrecorrer(Root,datos);
        }
        else{
            System.out.println("Arbol vacio");
        }
        return "DATOS DE CLIENTES\n" + datos;
            }
    
    private String inordenrecorrer(Nodo_Cliente node,String datos){
        
        if(node!=null){
             datos+=inordenrecorrer(node.getL(),datos);
             
            datos="\nCédula: ["+node.getPersona().getCédula()+"]\n"
                    +"Nombre Completo: ["+ node.getPersona().getNombre_Completo()+"]\n"
                    +"Fecha de Nacimiento: ["+ node.getPersona().getFecha()+"]\n"
                    +"Correo Electrónico: ["+ node.getPersona().getCorreo()+"]\n"
                    +"Categoría: ["+ node.getPersona().getCategoria()+"]\n"
                    +"---------------------------------------------------------------------------------\n";
           
            datos+=inordenrecorrer(node.getR(),datos);
            return datos;
        }
        else{
            return "";
        }
        
    }
    public Cliente getpersona(Nodo_Cliente node, int cedula){
        Cliente persona=null;
        int ced=node.getPersona().getCédula();
        if(node!=null){
        if(cedula>ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula<ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula==ced){
            persona=node.getPersona();
        }
        }
        else{
            return null;
        }
        return persona;
    }
    public String search(int cedula){
        String datos="DATOS DE CLIENTE\n";
        datos=buscar(Root,cedula);
        return datos;
    }
    public String buscar(Nodo_Cliente node, int cedula){
        String datos="";
        int ced=node.getPersona().getCédula();
        if(node!=null){
        if(cedula>ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula<ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula==ced){
            datos+="\nCédula: ["+node.getPersona().getCédula()+"]\n"
                    +"Nombre Completo: ["+ node.getPersona().getNombre_Completo()+"]\n"
                    +"Fecha de Nacimiento: ["+ node.getPersona().getFecha()+"]\n"
                    +"Correo Electrónico: ["+ node.getPersona().getCorreo()+"]\n"
                    +"Categoría: ["+ node.getPersona().getCategoria()+"]\n"
                    +"---------------------------------------------------------------------------------\n";
        }
        }
        else{
            return "No se encontro cliente";
        }
        return datos;
    }
    
    public void modificar(Nodo_Cliente node, Cliente persona){
        int cedula=persona.getCédula();
         int ced=node.getPersona().getCédula();
        if(cedula>ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula<ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula==ced){
            node.setPersona(persona);
        }
    }
    
    public void eliminar(Nodo_Cliente node, Cliente persona){
         int cedula=persona.getCédula();
         int ced=node.getPersona().getCédula();
        if(cedula>ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula<ced){
            buscar(node.getR(),cedula);
        }
        else if(cedula==ced){
            //Eliminar
        }
    }
}
