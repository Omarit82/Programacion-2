package Composite.Practica.Prefinal82023;

public class OrdenadorNombre extends Ordenador {
    private Ordenador siguiente;

    public OrdenadorNombre(){
        siguiente = null;
    }

    public OrdenadorNombre(Ordenador siguiente){
        super(siguiente);
    }

    public int comparar(Juguete j1,Juguete j2){
        return (j1.getNombre().compareTo(j2.getNombre()));
    }

    
}
