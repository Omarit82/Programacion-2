package Practica7.Agroquimicos;
import java.util.ArrayList;

public class Producto {
    /*Un producto químico tiene asociado un nombre,
    un conjunto cultivos donde se desaconseja su uso (por ejemplo girasol, lino, maíz), y un
    conjunto de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de
    tratar (por ejemplo hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros). */
    private String nombre;
    private ArrayList<Cultivo>cultivosDesaconsejados;
    private ArrayList<String>sintomas;

    public Producto(String nombre){
        cultivosDesaconsejados = new ArrayList<Cultivo>();
        sintomas = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivoDesaconsejado(Cultivo c){
        cultivosDesaconsejados.add(c);
    }
    public void addEnfermedadesQueTrata(String e){
        sintomas.add(e);
    }
}
