package Alquiler;
import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private static int contador = 1;
    private int id; 
    private ArrayList<ItemAlquiler> itemsAlquilados;

    public Cliente(String nombre){
        this.nombre = nombre;
        itemsAlquilados = new ArrayList<>();
        id = contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void addItem(ItemAlquiler item){
        itemsAlquilados.add(item);
    }

       
}
