

package grupo4.tarea_listas;

import rednarf.lista_circular.Lista;
import rednarf.lista_doble.Lista;


public class Tarea_Listas {

    public static void main(String[] args) {
        
        //Ejercicio 1 Lista Simple
        /* 
        Lista_Simple Lista1 = new Lista_Simple();
        
        Lista1.Insertar(1);
        Lista1.Insertar(2);
        Lista1.Insertar(3);
        Lista1.Insertar(4);
        Lista1.Insertar(5);
        
        Lista1.Buscar(1);
        */
        
        //Ejercicio 2 Lista Circular Simple
        
        /*
        Lista_Circular Lista2 = new Lista_Circular();
        
        Lista2.Insertar(27);
        Lista2.Insertar(20);
        Lista2.Insertar(28);
        Lista2.Insertar(1);
        Lista2.Insertar(7);
        Lista2.Insertar(2);
        Lista2.Insertar(76);
        
        Lista2.LimpiarTail(27);
        Lista2.LimpiarTail(20);
        Lista2.LimpiarTail(27);
*/
        
        //Ejercicio 3 Lista Circular Doblemente Enlazada
        
        
        Lista Lista3 = new Lista();
        
      Lista3.Insertar(27);
      Lista3.Insertar(13);
      Lista3.Insertar(34);
      Lista3.Insertar(65);
      Lista3.Insertar(2798);
      Lista3.Insertar(27);
      
      Lista3.Mostrar();
      
      Lista3.EliminarIndex(5);
      
      Lista3.Mostrar();
    }
}
