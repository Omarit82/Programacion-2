package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesPosibles;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesPosibles = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarEnfermedad(Enfermedad enfermedad){
        if(!enfermedadesPosibles.add(enfermedad)){
            enfermedadesPosibles.add(enfermedad);
        }
    }
    public boolean esUtil(Producto prod){
        /* Debe decidir si al cultivo le es util el producto. */
    }

    
    @Override
    public boolean equals(Object cultivo){
        try {
            return this.getNombre().equals(((Cultivo)cultivo).getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
