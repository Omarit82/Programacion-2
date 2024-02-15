package Agroquimicos;

import java.util.ArrayList;

public class EmpresaAgroquimica {

    private ArrayList<Cultivo> cultivos;
    private ArrayList<Producto> productos;
    private ArrayList<Enfermedad> enfermedades;

    /*Se debe diseñar e implementar un sistema para una empresa agrícola que se dedica a la
    fabricación y venta de productos químicos. Un producto químico tiene asociado un nombre,
    un conjunto cultivos donde se desaconseja su uso (por ejemplo girasol, lino, maíz), y un
    conjunto de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de
    tratar (por ejemplo hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros).
    El sistema está pensado para ayudar a las agrícolas a decidir qué agroquímico se puede
    utilizar para tratar ciertas enfermedades de los cultivos. Una enfermedad tiene un nombre
    asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo:
    Cochinilla (estados patológicos: deshidratación, hojas amarillas). Aclaración: los estado
    patológicos de una enfermedad se corresponden con los estados patológicos que los
    productos son capaces de tratar.
    Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden
    afectar. Asimismo dado un producto químico, los cultivos son capaces de decir si en algún
    momento puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus
    enfermedades frecuentes y no se desaconseja su uso en el cultivo. Se considera que el
    agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
    contenidos por las acciones del producto químico.
    Se debe proveer los siguientes servicios:
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
    

   
}
