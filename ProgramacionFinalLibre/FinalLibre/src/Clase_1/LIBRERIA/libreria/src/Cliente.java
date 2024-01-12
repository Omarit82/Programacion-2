import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private double descuento;
    ArrayList<String>autores;
    ArrayList<String>generos;
    ArrayList<ProductoLibreria> compras;

    public Cliente(String nombre, String apellido, int dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        autores = new ArrayList<>();
        generos = new ArrayList<>();
        compras = new ArrayList<>();
    }
    /* Metodos */
    public void agregarAutor(String autor){
        String aux = autor.toUpperCase();
        if(!autores.contains(aux)){
            autores.add(aux);
        }
    }

    public void agregarGenero(String genero){
        String aux = genero.toUpperCase();
        if(!generos.contains(aux)){
            generos.add(aux);
        }
    }

    public boolean comproProducto(ProductoLibreria producto){
        if(compras.contains(producto)){
            return true;
        }else{
            return false;
        }
    }

    public boolean meGusta(ProductoLibreria producto){
        if(autores.contains(producto.getAutor())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object obj){
        /* Dos clientes son iguales si tienen el mismo dni */
        Cliente auxiliar = (Cliente)obj;
        try {
            if(this.getDni() == auxiliar.getDni()){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            return false;
        }
    }
    /*Getters & Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
