package Practica6.PuertoCereales;
import java.util.ArrayList;


public  class ColaEspera {
    private ArrayList<ElementoCola> cola;

    public ColaEspera(){
        cola = new ArrayList<>();
    }

    /*
     * Esta es una cola de espera generica de Elementos Cola.
     * Los elementos cola tienen definido el metodo es mayor.
     * 
     * Debo generar un metodo add, que cuando agrege un elemento cola, recorra la cola comparando los elementos
     * con el metodo es mayor y coloque el elemento a ingresar en el indice correspondientes
     */

    public void agregarACola(ElementoCola ele){
        int i=0;
        while ((!cola.isEmpty()) && (i<cola.size()) && (cola.get(i).esMayor(ele))){ 
        //Si al cola no esta vacia y el elemento en esa posicion es mayor al que quiero ingresar y no supere el maximo indice de la cola. subo el indice.
            i++;
        }
        //Salida del while, o la cola esta vacia. o encontre un elemento menor, o supere el maximo indice
        if(i == cola.size()){   // supere el maximo indice
            cola.add(ele);
        }else{                  // o esta vacia o encontre el elemento donde agregar
            cola.add(i, ele);
        }
    }

    public boolean isEmpty(){
        if(cola.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public ElementoCola get(){
        if(!cola.isEmpty()){
            return cola.get(0);
        }else{
            return null;
        }
    }

    public void remove(ElementoCola e){
        cola.remove(e);
    }

    public String toString (){
        return cola.toString();
    }
}