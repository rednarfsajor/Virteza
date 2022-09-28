
package Tarea_Recursividad;


public class Recursividad {
    
    
   public static int N_Invertido(int n, int i){
       if(n>0){
           return N_Invertido(n/10,n%10+i*10);
       }
       else{
           return i;
       }
       
       
   }
   
   public static void Cadena_Impresa(String cadena, int i){
      if(i==cadena.length()-1){
          System.out.println(cadena.charAt(i));
          
      }
      else{
          System.out.println(cadena.charAt(i));
          Cadena_Impresa(cadena,i+1);
      }
       
   }
  
    
}
