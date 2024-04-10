
package virteza.tarea2;


public class Pila {
    private NodoP Cima;
    
    
    public void Push(Camisa Shirt){
        NodoP newNodo=new NodoP(Shirt);
        if(Cima== null){
            Cima=newNodo;
        }
        else{
            if(Cima.getShirt().getTalla() != Shirt.getTalla() && Cima.getShirt().getColor() != Shirt.getColor()){
                if(Shirt.getMarca().equals("BUNNY")){
                    newNodo.setNext(Cima.getNext());
                    Cima.setNext(newNodo);
                }
                else{
                    newNodo.setNext(Cima);
                    Cima=newNodo;
                }
               
            }
            else{
                System.out.println("Camisa no añadida debido a que el color o talla es igual a la talla de la cima");
            }
            
        }
        
        
    }
    
    
    public Camisa Pop(){
        NodoP popped=Cima;
        if(Cima!=null){
            Cima=Cima.getNext();
            return popped.getShirt();
        }
        else{
            return null;
        }
    }
    
    public String Mostrar(){
        String TODO="";
        TODO=Mostrar_Apartir(Cima,TODO);
        TODO="//TOP//\n"+TODO;
        return TODO+"\n//BUTTOM//";
    }
    
    
    public static String Mostrar_Apartir(NodoP nodo, String txt){
        if(nodo!=null){
            txt=Mostrar_Apartir(nodo.getNext(),txt)+txt;
            txt="\n["+nodo.getShirt().getMarca()+"]["+nodo.getShirt().getConfeccion()+"]["+nodo.getShirt().getTipo()+"]["+nodo.getShirt().getColor()+"]["+nodo.getShirt().getTalla()+"]"+txt;
            
            return txt;
        }
        else{
            return "\n";
        }
    }
        public String Reptalla(){
            String TallaRep;
            TallaRep=Recorrer(Cima);
            
            
            return TallaRep;
        }
        
        public static String Recorrer(NodoP nodo){
            int S=0;
            int M=0;
            int L=0;
            
            while(nodo!=null){
                String talla = nodo.getShirt().getTalla();
                switch (talla){
                   case "S":
                       S+=1;
                       break;
                   case "M":
                       M+=1;
                       break;
                   case "L":
                       L+=1;
                       break; 
                
               }
                nodo=nodo.getNext();
            }
             if(S>M && S>L){
                return "La talla que mas se repite es: [S]";
            }
            else if(M>S && M>L){
                return "La talla que mas se repite es: [M]";
            }
            else if(L>S && L>M){
                return "La talla que mas se repite es: [L]";
            }
            else if(S==M && S>L){
                return "Las tallas que mas se repiten son: S & M";
            }
            else if(S==L &&  S>M){
                return "Las tallas que mas se repiten son: S & L";
            }
            else if(M==L && M>S){
                return "Las tallas que mas se repiten son: M & L";
            }
            else if(S==M && M==L){
                return "Todas las tallas se repiten en mismas cantidades";
            }
            else{
                return "NULL";
            }
        }
               
        }
         
