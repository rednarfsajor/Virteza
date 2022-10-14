
package virteza.tarea2;


public class Cola {
    private NodoC Head=null;
    private NodoC Tail;
    
    public void Push(Persona human){
        NodoC newnodo=new NodoC(human);
        if(Head==null){
            Head=newnodo;
            Tail=newnodo;
            newnodo.setNext(null);
        }
        else{
            this.EncontrarLugar(newnodo, Head, Head);
        }
        
    }
    
    public void EncontrarLugar(NodoC newnodo, NodoC anterior,NodoC presente){
        
        int tipo1=TYPE(newnodo.getHumano());
        int tipo2=TYPE(presente.getHumano());
            if(tipo1==tipo2){
                        if(newnodo.getHumano().getHora()==presente.getHumano().getHora()){
                            if(newnodo.getHumano().getCedula()>presente.getHumano().getCedula()){
                                newnodo.setNext(anterior.getNext());
                                anterior.setNext(newnodo);


                            }
                             else{
                                    if(presente.getNext()!=null){
                                         this.EncontrarLugar(newnodo, presente, presente.getNext());
                                    }
                                    else{
                                        presente.setNext(newnodo);
                                        this.Tail=newnodo;
                                        newnodo.setNext(null);
                                    }
                            }
                        }
                        else if(newnodo.getHumano().getHora()<presente.getHumano().getHora()){
                            newnodo.setNext(anterior.getNext());
                            anterior.setNext(newnodo);

                        }
                        else{
                            if(presente.getNext()!=null){
                                         this.EncontrarLugar(newnodo, presente, presente.getNext());
                            }
                            else{
                                presente.setNext(newnodo);
                                 this.Tail=newnodo;
                                  newnodo.setNext(null);
                            }
                        }
                    }
                    else if(tipo1>tipo2){
                        newnodo.setNext(anterior.getNext());
                        anterior.setNext(newnodo);

                    }
                    else{
                        if(presente.getNext()!=null){
                                         this.EncontrarLugar(newnodo, presente, presente.getNext());
                                    }
                                    else{
                            presente.setNext(newnodo);
                                        this.Tail=newnodo;
                                        newnodo.setNext(null);
                                    }
                    }
            
    }
    public NodoC pull(){
        if(Head==null){
            System.out.println("La cola esta vacia");
            return null;
        }
        else{
            NodoC Aux=Head;
            Head=Head.getNext();
            return Aux;
        }
    }
    
    
    public static int TYPE(Persona human){
        int tipo;
        String Type=human.getTipo();
        switch(Type){
            case "PALCO":
                tipo=3;
                break;
            case "SOMBRA":
                tipo=2;
                break;
            case "SOL":
                tipo=1;
                break;
            default:
                tipo=0;
                break;
        }
        return tipo;
    }
    
    
    public String Mostrar(){
        String TODO="";
        TODO=Mostrar_Apartir(Head,TODO);
        TODO="//TOP//\n"+TODO;
        return TODO+"\n//BUTTOM//";
    }
    
    
    public static String Mostrar_Apartir(NodoC nodo, String txt){
        if(nodo!=null){
            txt=Mostrar_Apartir(nodo.getNext(),txt)+txt;
            txt="\n["+nodo.getHumano().getCedula()+"]["+nodo.getHumano().getTipo()+"]["+nodo.getHumano().getHora()+"]["+nodo.getHumano().getLocalidad()+"]"+txt;
            
            return txt;
        }
        else{
            return "\n";
        }
    }
}
