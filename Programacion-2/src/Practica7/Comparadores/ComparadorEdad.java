package Practica7.Comparadores;

public class ComparadorEdad extends ComparadorPersonas{

    public ComparadorEdad(){
    }
    public ComparadorEdad(ComparadorPersonas siguiente){
        super(siguiente);
    }

    public int comparar(Persona p1, Persona p2){
        return p1.getEdad()-p2.getEdad();
    }
}
