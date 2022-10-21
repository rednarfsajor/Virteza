/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Pila {
     private Nodo Top;
     
     
     public void ApilarPlato(Plato value){
         Nodo newnodo = new Nodo();
         newnodo.setValue2(value);
         if(Top==null){
             Top=newnodo;
             
         }
         else{
             if(value.isCubiertos()){
                 newnodo.setNext(Top);
                 Top=newnodo;
             }
             else{
                 this.Recorrer(newnodo, Top, Top);
             }
         }
         
         
     }
     
     public Nodo LavarPlato(){
         if(Top==null){
             return null;
         }
         else{
             Nodo Aux=Top;
             Top=Top.getNext();
             return Aux;
         }
         
     }
     
     
     public void Recorrer(Nodo newnodo, Nodo Anterior, Nodo Presente){
         if(Presente.getValue2().isCubiertos()){
             if(Presente.getNext()==null){
                 Anterior.setNext(newnodo);
             }
             else{
                 this.Recorrer(newnodo, Presente, Presente.getNext());
             }
         }
         else{
             Anterior.setNext(newnodo);
             newnodo.setNext(Presente);
         }
     }

    public Nodo getTop() {
        return Top;
    }
     
     public String Mostrar(){
        String TODO="";
        TODO=Mostrar_Apartir2(Top,TODO);
        
        return TODO;
    }
    
    public static String Mostrar_Apartir2(Nodo nodo, String txt){
        if(nodo!=null){
            
            txt=Mostrar_Apartir2(nodo.getNext(),txt)+txt;
            txt="---------------------------\n[ID: "+String.valueOf(nodo.getValue2().getID())+"]\n[Cubiertos: "+String.valueOf(nodo.getValue2().isCubiertos())+"]\n"+txt;
            
            return txt;
        }
        else{
            return "\n";
        }
    }
}
