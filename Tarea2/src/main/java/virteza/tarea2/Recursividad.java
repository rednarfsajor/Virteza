
package virteza.tarea2;

import java.lang.Math;
public class Recursividad {
    
    
    
    public static double Taylor(int x,int n, int i){
        double result=0;
        
        if(i>0){
            result+=(Math.pow(-1, n)/Factorial(2*n))*Math.pow(x,2*n);
            result+=Taylor(x,n, i-1);
            return result;
        }
        else{
            return result;
        }
        
        
        
    }
    
    
    
    //Datos de la tarea en version For
    public static double calCos(int x, int n){
        double result=0;
        for(int i=0;i<n;i++){
            result+=(Math.pow(-1, n)/factorial(2*n))*Math.pow(x,2*n);
        }
        return result;
    }
    
    
    public static double factorial(int num){
        double result=1.0;
        for(int i=1;i<=num;i++){
        result=result*i;
    }
        return result;
    }
    
    
    
    //Tarea
    public static int Factorial(int n){
        int result;
        
        if(n>0){
            result=n*Factorial(n-1);
            return result;
        }
        else{
            return 1;
        }
       
    }
}
