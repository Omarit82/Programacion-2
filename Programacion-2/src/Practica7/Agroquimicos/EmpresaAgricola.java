package Practica7.Agroquimicos;
import java.util.ArrayList;

public class EmpresaAgricola {
    private ArrayList<Cultivo> cultivos;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Producto> productos;

    public EmpresaAgricola(){
        cultivos = new ArrayList<Cultivo>();
        enfermedades = new ArrayList<Enfermedad>();
        productos = new ArrayList<Producto>();
    }

    public void addCultivo(Cultivo c){
        cultivos.add(c);
    }

    public void addEnfermedad(Enfermedad e){
        enfermedades.add(e);
    }

    public void addProducto(Producto p){
        productos.add(p);
    }

    /*Para una enfermedad dada, devuelvo una lista de los productos quimicos que la curan. */
    public ArrayList<Producto> agroquimicos(Enfermedad e){
        ArrayList<Producto>auxiliar = new ArrayList<>();
        for (Producto prod : productos) {
            if(prod.cura(e)){
                auxiliar.add(prod);
            }
        }
        return auxiliar;
    }
    
}
