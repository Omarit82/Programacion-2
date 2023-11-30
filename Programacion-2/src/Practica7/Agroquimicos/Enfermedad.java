package Practica7.Agroquimicos;
import java.util.ArrayList;
public class Enfermedad {
    /*Una enfermedad tiene un nombre y sintomas */
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
    public boolean contieneSintoma(String sintoma){
        return sintomas.contains(sintoma);
    }

}
