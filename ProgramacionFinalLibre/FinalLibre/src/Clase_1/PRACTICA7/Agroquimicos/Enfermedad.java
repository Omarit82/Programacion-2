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

    public void addEstadoPatologico(String estadoPat){
        if(!estadoPatologico.contains(estadoPat)){
            estadoPatologico.add(estadoPat);
        }
    }
    
    public boolean contieneEstado(String estado){
        if(estadoPatologico.contains(estado)){
            return true;
        }else{
            return false;
        }
    }

    public boolean trataEnfermedad(Producto producto){
        boolean trata = true;
        int i=0;
        while(i<estadoPatologico.size()&&trata){
            if(!producto.contieneEstado(estadoPatologico.get(i))){
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
}
