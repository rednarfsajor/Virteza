
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
        public char Reptalla(){
            char TallaRep;
            TallaRep=Recorrer(Cima);
            
            
            return TallaRep;
        }
        
        public static char Recorrer(NodoP nodo){
            int S=0;
            int M=0;
            int L=0;
            
            while(nodo!=null){
                char talla = nodo.getShirt().getTalla();
                switch (talla){
                   case 'S':
                       S+=1;
                       break;
                   case 'M':
                       M+=1;
                       break;
                   case 'L':
                       L+=1;
                       break; 
                
               }
                nodo=nodo.getNext();
            }
             if(S>M && S>L){
                return 'S';
            }
            else if(M>S && M>L){
                return 'M';
            }
            else if(L>S && L>M){
                return 'L';
            }
            else if(S==M && S>L){
                return 'n';
            }
            else if(S==L &&  S>M){
                return 'n';
            }
            else if(M==L && M>S){
                return 'n';
            }
            else if(S==M && M==L){
                return 'n';
            }
            else{
                return 'n';
            }
        }
               
        }
         
