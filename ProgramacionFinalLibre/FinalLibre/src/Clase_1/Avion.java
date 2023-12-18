package Clase_1;

public class Avion {
    /*Atributos : Tipo + nombre */
    private int codigoId;
    private String color;
    private int cantidadAsientos;
    private int cantidadTripulacion;
    private double balance;

    /*Constructor */
    public Avion(){
        codigoId = 15;
        color = "blanco";
        cantidadAsientos = 3;
        cantidadTripulacion = 1;
        balance = cantidadTripulacion / cantidadAsientos;
    }
    public Avion(int codigoId){
        this.codigoId = codigoId;
        color = "blanco";
        cantidadAsientos = 3;
        cantidadTripulacion = 1;
        balance = cantidadTripulacion / cantidadAsientos;
    }

    /*Metodos */
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        if(!color.equals("celeste"))
        this.color = color;
    }

    public int codigoIdentificacion(){
        return codigoId;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
        balance = cantidadTripulacion / cantidadAsientos;
    }

    public int getCantidadTripulacion() {
        return cantidadTripulacion;
    }

    public void setCantidadTripulacion(int cantidadTripulacion) {
        this.cantidadTripulacion = cantidadTripulacion;
        balance = cantidadTripulacion / cantidadAsientos;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Avion air314 = new Avion();

    }
    
}
