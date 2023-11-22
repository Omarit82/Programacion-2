package Practica3.Fabrica;
    /*
    * productos guarda su peso, su costo de fabricación, el valor de venta, el tipo de madera y el color.
    */
public class Producto {
    private double porcentaje = 1.35;
    private double peso;
    private double costoFabricacion;
    private double valorVenta;
    private String tipoMadera;
    private String color;

    public Producto (double peso, double costoFabricacion,String tipoMadera, String color){
        this.peso = peso;
        setCostoFabricacion(costoFabricacion);
        this.tipoMadera = tipoMadera;
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCostoFabricacion() {
        return costoFabricacion;
    }
    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
        valorVenta = costoFabricacion*porcentaje;
    }
    public double getValorVenta() {
        return valorVenta;
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

    
}
