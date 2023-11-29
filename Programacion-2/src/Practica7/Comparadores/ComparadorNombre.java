package Practica7.Comparadores;

public class ComparadorNombre extends ComparadorPersonas {
    public ComparadorNombre(){

    }
    public ComparadorNombre(ComparadorPersonas siguiente){
        super(siguiente);
    }
    
    public int comparar(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }

}
