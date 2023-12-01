package Composite.Practica.Prefinal82023;

public class OrdenadorMarca extends Ordenador{

    private Ordenador siguiente;

    public OrdenadorMarca(){
        siguiente = null;
    }

    public OrdenadorMarca(Ordenador siguiente){
        super(siguiente);
    }

    public int comparar(Juguete j1,Juguete j2){
        return (j1.getMarca().compareTo(j2.getMarca()));
    }
}
