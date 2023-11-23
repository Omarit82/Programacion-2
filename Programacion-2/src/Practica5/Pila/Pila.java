package Practica5.Pila;

public class Pila {
    /*
     * Implementar una pila de elementos.
     * add con el metodo push(Object o) - Eliminar con pop() que retorna el ultimo agregado y lo elimina de la lista.
     * top() devuelve el tope de la pila sin eliminarlo.
     * definir:
     *      size() retorna la cantidad de elementos almacenados.
     *      copy() nueva pila con una copia de los elementos de la original.
     *      reverse() retorna una copia de la pila pero con los elementos en el orden inverso.
     */

    private Object[]pila;
    public static final int MAX = 100;

    public Pila(){
        pila = new Object[MAX];
    }

    public void push(Object o){
        int i=0;
        while((i<pila.length)&&(pila[i] != null)){
            i++;
        }
        if (i<pila.length){
            pila[i] = o;
        } else{
            System.out.println("Pila llena");
        }
    }

    public int size(){
        int i=0;
        while((i<pila.length)&&(pila[i] != null)){
            i++;
        }
        return i;
    }

    
    public Object pop(){
        int i=0;
        while((i<pila.length)&&(pila[i] != null)){
            i++;
        }
        if(i == 0){  // Puede agregarse un msj diciendo que la pila esta vacia.
            return pila[i];
        }else{
            Object salida = pila[i-1]; // copio el objeto
            pila[i-1] = null; // elimino el objeto en la posicion indicada del arreglo.
            return salida; // retorno el objeto copiado previamente.
        }
    }

    public Object top(){
        return pila[0];
    }


}
