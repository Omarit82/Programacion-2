package Practica7.Comparadores.ComAutos;

public class ComparadorNombre extends ComparadorAuto {

    private ComparadorAuto siguiente;

    public ComparadorNombre(){
        this.siguiente = null;
    }
    public ComparadorNombre(ComparadorAuto siguiente){
        super(siguiente);
    }
    
    public int comparar(Auto a1, Auto a2){
        return a1.getNombre().compareTo(a2.getNombre());
    }
}
