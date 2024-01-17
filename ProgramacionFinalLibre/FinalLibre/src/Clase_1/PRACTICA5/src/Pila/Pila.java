package Pila;
import java.util.ArrayList;
public class Pila {
    private ArrayList<Object> objetos;

    public Pila(){
        objetos = new ArrayList<>();
    }

    /*Vamos a mantener el ArrayList como una verdadera Pila. 
    Es decir, el ultimo elemento ingresado queda con el indice mas bajo */

    public void push(Object objetoNuevo){
        if(!objetos.isEmpty()){
            this.reverse();
            objetos.add(objetoNuevo);
            this.reverse();

        }else{
            objetos.add(objetoNuevo);
        }
    }
    /* Revierte el orden de los elementos dentro del arreglo */
    public ArrayList<Object> reverse(){
        if(objetos.size()>1){
            /* Si tiene mas de un elemento lo debo dar vuelta. */
            /* Genero un arreglo auxiliar */
            ArrayList<Object> auxiliar = new ArrayList<>();
            for(int i = objetos.size()-1; i>=0;i--){
                auxiliar.add(objetos.get(i));
            }
            objetos = auxiliar;
            return objetos;
        }else{
            return objetos;
        }
    } 
    /*Muestra por pantalla los objetos listados en el arreglo */

    public void listarObjetos(){
        for (Object object : objetos) {
            System.out.println(object);
        }
    }

    /* Devuelve el numero de elementos  */

    public int size(){
        return objetos.size();
    }

    public Pila copy(){
        Pila auxiliar = new Pila();
        for (Object object : objetos) {
            auxiliar.push(object);
        }
        auxiliar.reverse();
        return auxiliar;
    }

    public Object pop(){
        Object aux = new Object();
        aux = objetos.get(0);
        objetos.remove(0);
        return aux;
    }

    public Object top(){
        return objetos.get(0);
    }
}
