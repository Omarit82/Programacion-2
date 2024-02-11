package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadoPatologico;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        estadoPatologico = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals(Object enfermedad){
        try {
            return this.getNombre().equals(((Enfermedad) enfermedad).getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
