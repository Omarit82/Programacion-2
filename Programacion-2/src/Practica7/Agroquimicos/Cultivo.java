package Practica7.Agroquimicos;
import java.util.ArrayList;
public class Cultivo {
    /* Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden
    afectar.  */
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedades = new ArrayList<Enfermedad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEnfermedad(Enfermedad e){
        enfermedades.add(e);
    }
}
