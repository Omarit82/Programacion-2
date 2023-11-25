package Practica7.Agroquimicos;
import java.util.ArrayList;
public class Enfermedad {
    /*Una enfermedad tiene un nombre
    asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo:
    Cochinilla (estados patológicos: deshidratación, hojas amarillas). Aclaración: los estado
    patológicos de una enfermedad se corresponden con los estados patológicos que los
    productos son capaces de tratar. */
    private String nombre;
    private ArrayList<String>sintomas;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        sintomas = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSintoma(String sntm){
        sintomas.add(sntm);
    }
}
