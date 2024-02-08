package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesPosibles;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesPosibles = new ArrayList<>();
    }
}
