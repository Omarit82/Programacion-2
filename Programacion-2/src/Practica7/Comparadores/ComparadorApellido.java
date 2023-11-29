package Practica7.Comparadores;

public class ComparadorApellido extends ComparadorPersonas {

    public ComparadorApellido(){
        
    }

    public ComparadorApellido(ComparadorPersonas siguiente){
        super(siguiente);
    }
    
    public int comparar(Persona p1, Persona p2){
        return p1.getApellido().compareTo(p2.getApellido());
    }
}
