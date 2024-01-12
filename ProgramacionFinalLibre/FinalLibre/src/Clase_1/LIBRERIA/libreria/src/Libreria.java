import java.util.ArrayList;

public class Libreria {
    private ArrayList<Cliente>clientes;
    private ArrayList<ProductoLibreria>productos;

    public Libreria(){
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
    }

    /*Metodos */
    public void agregarCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
        }
    }

    public void agregarProducto(ProductoLibreria producto){
        if(!productos.contains(producto)){
            productos.add(producto);
        }
    }

    public double getPrecio(ProductoLibreria producto, Cliente cliente){
        return producto.getPrecio()-(producto.getPrecio()*cliente.getDescuento()/100);
    }
    public boolean leGusta(ProductoLibreria producto, Cliente cliente){
        return cliente.meGusta(producto);
    }

    public boolean comproProducto(ProductoLibreria producto, Cliente cliente){
        if(cliente.comproProducto(producto)){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Cliente> lesGustaProducto(ProductoLibreria producto){
        ArrayList<Cliente> lesGusta = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if(cliente.meGusta(producto)){
                lesGusta.add(cliente);
            }
        }
        return lesGusta;
    }
}
