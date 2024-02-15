package Agroquimicos;

import java.util.ArrayList;

public class EmpresaAgroquimica {

    private ArrayList<Cultivo> cultivos;
    private ArrayList<Producto> productos;
    private ArrayList<Enfermedad> enfermedades;

    /*Se debe proveer los siguientes servicios:
        ● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
        ● Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
    pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
    determinados cultivos */

    public EmpresaAgroquimica(){
        cultivos = new ArrayList<>();
        productos = new ArrayList<>();
        enfermedades = new ArrayList<>();
    }
    
    public void addCultivo(Cultivo cultivo){
        if(!cultivos.contains(cultivo)){
            cultivos.add(cultivo);
        }
    }

    public void addProducto(Producto producto){
        if(!productos.contains(producto)){
            productos.add(producto);
        }
    }

    public void addEnfermedades(Enfermedad enfermedad){
        if(!enfermedades.contains(enfermedad)){
            enfermedades.add(enfermedad);
        }
    }

    /*Servicios */
    /*   ● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada. */
    public void listadoProductos(Enfermedad enfermedad){
        for (Producto producto : productos) {
            if(producto.trataEnfermedad(enfermedad)){
                System.out.println(producto);
            }
        }
    }
    /*● Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
    pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
    determinados cultivos */
    public void listadoProductos(Cultivo cult, Enfermedad enf){
        for (Producto prod : productos) {
            if(!prod.cultivoDesaconsejado(cult) && prod.trataEnfermedad(enf)){
                System.out.println(prod);
            }
        }
    }
   
}
