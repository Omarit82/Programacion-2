package Agroquimicos;

import java.util.ArrayList;

public class Producto{
    private String nombre;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    private ArrayList<String> estadoPatologico;

    public Producto (String nombre){
        this.nombre = nombre;
        cultivosDesaconsejados = new ArrayList<>();
        estadoPatologico = new ArrayList<>();
    }
}

