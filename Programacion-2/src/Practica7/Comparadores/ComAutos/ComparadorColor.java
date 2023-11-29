package Practica7.Comparadores.ComAutos;

public class ComparadorColor extends ComparadorAuto {
    private ComparadorAuto siguiente;

    public ComparadorColor(){
        siguiente = null;
    }

    public ComparadorColor(ComparadorAuto siguiente){
        super(siguiente);
    }

    @Override
    public int comparar(Auto a1, Auto a2) {
       return a1.getColor().compareTo(a2.getColor());
    }
    
    
}
