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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivosDesaconsejados(Cultivo cultivo){
        if(!cultivosDesaconsejados.contains(cultivo)){
            cultivosDesaconsejados.add(cultivo);
        }
    }
    
    public void addEstadoPatologico(String patologia){
        if(!estadoPatologico.contains(patologia)){
            estadoPatologico.add(patologia);
        }
    }

    public boolean contieneEstado(String estado){
        if(estadoPatologico.contains(estado)){
            return true;
        }else{
            return false;
        }
    }
}

