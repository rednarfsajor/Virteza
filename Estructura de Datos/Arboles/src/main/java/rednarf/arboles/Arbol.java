/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rednarf.arboles;

/**
 *
 * @author Rednarf
 */
public class Arbol {
    private Nodo Root;
    private int Alt;

    public Nodo getRoot() {
        return Root;
    }

    public int getAlt() {
        Alt=0;
        Altura(Root,1);
        System.out.println(Alt);
        return Alt;
    }

    public void setRoot(Nodo Root) {
        this.Root = Root;
    }

    public void setAlt(int Alt) {
        this.Alt = Alt;
    }
    
    public void inserta(int value){
        Nodo newnodo = new Nodo(value);
        if(Root==null){
            Root=newnodo;
        }
        else{
            insertar(Root,value);
        }
    }
    private void insertar(Nodo node, int value){
        Nodo newnodo = new Nodo(value);
        if(value<=node.getId()){
            if(node.getL()==null){
                node.setL(newnodo);
            }
            else{
                insertar(node.getL(),value);
            }  
        }
        else{
            if(node.getR()==null){
                node.setR(newnodo);
            }
            else{
                insertar(node.getR(),value);
            }
        }
    }
    
    
    public void  inorden(){
        if(Root != null){
            inordenrecorrer(Root);
        }
        else{
            System.out.println("Arbol vacio");
        }
            }
    
    private void inordenrecorrer(Nodo node){
        if(node!=null){
            inordenrecorrer(node.getL());
            System.out.println(node.getId() + " , ");
            inordenrecorrer(node.getR());
        }
    }
    
    private void Altura(Nodo node, int level){
        if(node!=null){
            Altura(node.getL(), level+1);
            if(level>Alt){
                Alt=level;
            }
            System.out.println("En este momento giro a la derecha " + node.getId());
            Altura(node.getL(), level+1);
        }
    }
    
    
    }