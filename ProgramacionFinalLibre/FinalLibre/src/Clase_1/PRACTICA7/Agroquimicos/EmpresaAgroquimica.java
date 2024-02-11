package Agroquimicos;

import java.util.ArrayList;

public class EmpresaAgroquimica {

    private ArrayList<Cultivo> cultivos;
    private ArrayList<Producto> productos;
    private ArrayList<Enfermedad> enfermedades;

    public EmpresaAgroquimica(){
        cultivos = new ArrayList<>();
        productos = new ArrayList<>();
        enfermedades = new ArrayList<>();
    }

    public void addCultivo(Cultivo cultivo){
        cultivos.add(cultivo);
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public void addEnfermedades(Enfermedad enfermedad){
        enfermedades.add(enfermedad);
    }

    public ArrayList<Producto> listadoAgroquimicos(Enfermedad enfermedad){
        ArrayList<Producto> aux = new ArrayList<>();
        for (Producto producto : productos) {
            if(enfermedad.trataEnfermedad(producto)){
                aux.add(producto);
            }
        }
        return aux;
    }

    public ArrayList<Producto> listadoDadoCultivoEnfermedad(Enfermedad enfermedad, Cultivo cultivo){
        ArrayList<Producto> auxiliar = new ArrayList<>();
        
    }
}
