

package rednarf.lista_doble;


public class Lista_Doble {

    public static void main(String[] args) {
         Lista Lista = new Lista();
        
      Lista.Insertar(452);
      Lista.Insertar(13);
      Lista.Insertar(34424);
      
      Lista.Mostrar();
      
      Lista.EliminarIndex(2);
      
      Lista.Mostrar();
    }
}
