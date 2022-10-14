
package virteza.tarea2;


public class Tarea2 {

    public static void main(String[] args) {
        
        
        //Ejercicio 1
        double one;
        double two;
        
        one=Recursividad.calCos(1,2);
        two=Recursividad.Taylor(1,2,2);
        
        System.out.println("Resultado one= " + String.valueOf(one)+"\nResultado two= "+String.valueOf(two));
        
        //Ejercicio 2
        Camisa Camisa1=new Camisa("BUNNY","USA","POLO",'S',"ROJO");
        Camisa Camisa2=new Camisa("ADIDAS","USA","SPORT",'L',"BLANCO");
        Camisa Camisa3=new Camisa("NIKE","POLONIA","SPORT",'L',"NEGRO");
        Camisa Camisa4=new Camisa("BUNNY","CANADÁ","VESTIR",'M',"ROSADO");
        Camisa Camisa5=new Camisa("SILVER","CHINA","T-SHIRT",'S',"AZUL");
        Camisa Camisa6=new Camisa("BUNNY","CHINA","POLO",'S',"AMARILLA");
        Camisa Camisa7=new Camisa("NIKE","USA","SPORT",'M',"MORADO");
        
        
        Pila Pila_Camisas= new Pila();
        Pila_Camisas.Push(Camisa4);
        System.out.println(Pila_Camisas.Mostrar());
        
        System.out.println(Pila_Camisas.Reptalla());
        
        //Ejercicio 3
        /*
        Persona humano1=new Persona(402520190, "SOL", 13.00, "Heredia");
        Persona humano2=new Persona(402520191, "PALCO", 10.00, "San José") ;
        Persona humano3=new Persona(402520192, "SOMBRA", 13.00, "Alajuela") ;
        Persona humano4=new Persona(402520193, "PALCO", 13.00, "Heredia") ;
        Persona humano5=new Persona(402520194, "SOL", 15.00, "Alajuela") ;
        Persona humano6=new Persona(402520195, "SOMBRA", 13.00, "San José") ;
        Persona humano7=new Persona(402520196, "SOL", 13.00, "Heredia") ;
        
        Cola Fila = new Cola();
        
        Fila.Push(humano2);
        Fila.Push(humano7);
        Fila.Push(humano3);
        Fila.Push(humano4);
        Fila.Push(humano1);
        Fila.Push(humano5);
        
        System.out.println(Fila.Mostrar());
        System.out.println(Fila.pull().getHumano().getLocalidad());
        System.out.println(Fila.Mostrar());
        */
    }
}
