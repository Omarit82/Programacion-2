package Practica7.Comparadores.ComAutos;

public class ComparadorMarca extends ComparadorAuto {

    private ComparadorAuto siguiente;
    
    public ComparadorMarca(){
        this.siguiente = null;
    }
    public ComparadorMarca(ComparadorAuto siguiente){
        super(siguiente);
    }

    public int comparar(Auto a1, Auto a2){
        return a1.getMarca().compareTo(a2.getMarca());
    }
}
