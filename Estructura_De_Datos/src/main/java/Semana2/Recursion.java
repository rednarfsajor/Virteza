
package Semana2;


public class Recursion {
 
    
    
    public static int Factorial(int n){
        int result;
        
        if(n>0){
            result=n*Factorial(n-1);
        }
        else{
            return 1;
        }
       return result;
    }
}
