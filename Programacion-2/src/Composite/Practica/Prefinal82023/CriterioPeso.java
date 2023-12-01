package Composite.Practica.Prefinal82023;

public class CriterioPeso extends Criterio {
    
    public boolean cumple(ElementoColeccion e){
        Juguete jug = (Juguete) e;
        if(jug.getPeso()< 3000){
            return true;
        } else {
            return false;
        }

    }
}
