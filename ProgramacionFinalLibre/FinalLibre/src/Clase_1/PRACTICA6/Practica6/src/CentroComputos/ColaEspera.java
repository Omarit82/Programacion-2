package CentroComputos;

import java.util.ArrayList;

public abstract class ColaEspera {
    private ArrayList<ElementoCola> elementosOrdenados;
    
    public ColaEspera(){
        elementosOrdenados = new ArrayList<>();
    }

    /* La cola de espera se debe mantener ordenada. */
    public abstract boolean esMayor(ElementoCola e1, ElementoCola e2);
     
    /* Metodo template */
    public void addElemento(ElementoCola ee){
        boolean encontro = false;
        int i = 0;

        while(!encontro && elementosOrdenados.size()>i){
            if(this.esMayor(ee, elementosOrdenados.get(i))){
                elementosOrdenados.add(i, ee);
                encontro = true;
            }
            i++;
        }
        if(!encontro){
            elementosOrdenados.add(ee);
        }
    }
}
