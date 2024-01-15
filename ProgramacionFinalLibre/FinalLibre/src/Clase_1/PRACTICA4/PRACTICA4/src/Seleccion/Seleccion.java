package Seleccion;
import java.util.ArrayList;
public class Seleccion {
    private ArrayList<Integrante> integrantes;
    
    public Seleccion(){
        integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(Integrante nuevo){
        if(!integrantes.contains(nuevo)){
            integrantes.add(nuevo);
        }
    }

    public boolean disponible(Integrante integrante){
        return integrante.disponible();
    }

    public ArrayList<Integrante> personalDisponible(){
        ArrayList<Integrante> disponibles = new ArrayList<>();
        for (Integrante integrante : integrantes) {
            if (integrante.disponible()){
                System.out.println(integrante+" esta disponible");
                disponibles.add(integrante);
            }
        }
        return disponibles;
    }
}
