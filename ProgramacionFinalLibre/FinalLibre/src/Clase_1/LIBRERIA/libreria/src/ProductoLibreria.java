import java.util.ArrayList;

public class ProductoLibreria {
    private String titulo;
    private String autor;
    private double precio;
    private int cantidadPaginas;
    private String resumen;
    private ArrayList<String>generos;
    
    public ProductoLibreria(String titulo, String autor, double precio, int cantidadPaginas, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadPaginas = cantidadPaginas;
        this.resumen = resumen;
        generos = new ArrayList<>();
    }
    /*Metodos */
    public void agregarGenero(String genero){
        String auxiliar = genero.toUpperCase();
        if(!generos.contains(auxiliar)){
            generos.add(auxiliar);
        }
    }

    public boolean contieneGenero(String genero){
        String auxiliar = genero.toUpperCase();
        if(generos.contains(auxiliar)){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(Object obj){
        try{
            ProductoLibreria producto = (ProductoLibreria) obj;
            if(this.getTitulo().equals(producto.getTitulo()) && this.getAutor().equals(producto.getAutor()) && this.getPrecio()==producto.getPrecio()){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
       
    }

    /* Getters & Setters */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
}
