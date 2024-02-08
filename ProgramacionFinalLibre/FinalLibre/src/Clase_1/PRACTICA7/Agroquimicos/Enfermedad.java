package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadoPatologico;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        estadoPatologico = new ArrayList<>();
    }
}
