package Agroquimicos;
/*  Un producto químico tiene asociado un nombre,
    un conjunto cultivos donde se desaconseja su uso (por ejemplo girasol, lino, maíz), y un
    conjunto de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de
    tratar (por ejemplo hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros). 

    Se considera que el agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
    contenidos por las acciones del producto químico. 
*/
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
    public boolean cultivoDesaconsejado(Cultivo cultivo){
        return cultivosDesaconsejados.contains(cultivo);
    }
    public boolean trataEnfermedad(Enfermedad enfermedad){
        return enfermedad.esTratadaPor(this);
    }

    public boolean trataSintoma(String estado){
        if(estadoPatologico.contains(estado)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cultivosDesaconsejados=" + cultivosDesaconsejados
                + ", estadoPatologico=" + estadoPatologico + "]";
    }
    
}

