
package Semana2;


public class Clase2 {
 
    
    
    public static int Factorial(int F){
        int result;
        
        if(F>0){
            result=F*Factorial(F-1);
        }
        else{
            return 1;
        }
       return result;
    }
}
