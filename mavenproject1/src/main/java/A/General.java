/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class General {
    public static Cola Ordenes = new Cola();
    public static  Pila Platos = new Pila();
    public static Cola Llenar(){
        Cola ordenes= new Cola();
       
        
        Orden Orden1=new Orden("Frander Rojas", 402520190,3,0.00,false);
        Orden Orden2=new Orden("Christian Madrigal", 402520191, 3,0.00,true);
        Orden Orden3=new Orden("Valeria Rojas", 402520192, 1,0.00,false);
        Orden Orden4=new Orden("Elena Nito", 402520190, 2,0.00,true);
        ordenes.AgregarOrden(Orden1);
        ordenes.AgregarOrden(Orden2);
        ordenes.AgregarOrden(Orden3);
        ordenes.AgregarOrden(Orden4);
        
        return ordenes;
    }
    
    
}
