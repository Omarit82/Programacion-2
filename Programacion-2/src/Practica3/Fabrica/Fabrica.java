package Practica3.Fabrica;
import java.util.ArrayList;
public class Fabrica {
    private ArrayList<Producto>stock;
    
    public Fabrica (){
        stock = new ArrayList<Producto>();
    }

    public void addProducto(Producto p){
        stock.add(p);
    }

    public double valorStock(){
        double total = 0;
        for (Producto producto : stock) {
            total += producto.getValorVenta();
        }
        return total;
    }
}
