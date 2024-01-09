package FabricaMuebles;

import java.util.ArrayList;
/*La fábrica también posee un stock de productos disponibles. */
public class Fabrica {
    /*Atributos */
    private String nombreFabrica;
    private ArrayList<Producto> stock;
    
    /*constructor */
    public Fabrica(String nombreFabrica){
        this.nombreFabrica = nombreFabrica;
        stock = new ArrayList<Producto>();
    }

    public void addAlStock(Producto pp){
        if(pp !=null){
            stock.add(pp);
        }
    }

    public String getNombreFabrica() {
        return nombreFabrica;
    }

    public void setNombreFabrica(String nombreFabrica) {
        this.nombreFabrica = nombreFabrica;
    }

    public double costoTotalStock(){
        double total = 0;
        for (Producto producto : stock) {
            total += producto.getCosto();
        }
        return total;
    }
}
