package FabricaMuebles;
/*De cada uno de los productos guarda su peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. */
public class Producto {
    /* Atributos */
    private double peso;
    private double costo;
    private double valorVenta;
    private String nombre;
    private String tipoMadera;
    private String color;
    private double porcentajeGanancia = 35;
    /* Constructor */
    public Producto(String nombre,String tipoMadera,String color,double peso,double costo){
        this.peso = peso;
        this.costo = costo;
        this.nombre = nombre;
        this.color = color;
        this.tipoMadera = tipoMadera;
    }
    
    /*Metodos */
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoMadera() {
        return tipoMadera;
    }
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }
    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
    public double getValorVenta(){
        this.valorVenta = costo*(1+(porcentajeGanancia/100));
        return valorVenta;
    }

    public boolean equals(Object obj){
        Producto aux = (Producto)obj;
        if(this.nombre == aux.getNombre()){
            return true;
        }else{
            return false;
        }

    }
}
