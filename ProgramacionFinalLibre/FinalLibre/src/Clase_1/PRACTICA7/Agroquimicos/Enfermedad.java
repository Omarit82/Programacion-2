package Agroquimicos;
/*Una enfermedad tiene un nombre
    asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo:
    Cochinilla (estados patológicos: deshidratación, hojas amarillas). Aclaración: los estado
    patológicos de una enfermedad se corresponden con los estados patológicos que los
    productos son capaces de tratar. */
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

    public void addEstadoPatologico(String estadoPat){
        if(!estadoPatologico.contains(estadoPat)){
            estadoPatologico.add(estadoPat);
        }
    }
    
    public boolean generaSintoma(String estado){
        if(estadoPatologico.contains(estado)){
            return true;
        }else{
            return false;
        }
    }

    public boolean esTratadaPor(Producto prod){
        /*El producto pasado por parametro, trata la enfermedad? */
        int i=0;
        boolean trata = true;
        while(trata && i<estadoPatologico.size()){
            if(!prod.trataSintoma(estadoPatologico.get(i))){
                trata = false;
            }
            i++;
        }
        return trata;
    }

    @Override
    public boolean equals(Object enfermedad){
        try {
            return this.getNombre().equals(((Enfermedad) enfermedad).getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Enfermedad [nombre=" + nombre + ", estadoPatologico=" + estadoPatologico + "]";
    }

    
}
