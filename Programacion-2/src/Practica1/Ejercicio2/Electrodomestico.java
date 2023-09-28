package Practica1.Ejercicio2;

public class Electrodomestico {
    //Atributos
    private String nombre;
    private double precio;
    private String color;
    private int consumo;
    private double peso;
    //----------------
    //Constructores
    public Electrodomestico(){
        color = "gris plata";
        consumo = 10;
        precio = 100;
        peso = 2;
    }

    public Electrodomestico(String color){
        setColor(color);
        consumo = 10;
        precio = 100;
        peso = 2;
    }

    public Electrodomestico(String color, int consumo){
        setColor(color);
        setConsumo(consumo);
        precio = 100;
        peso = 2;
    }

    public Electrodomestico(String color, int consumo, double precio){
        setColor(color);
        setConsumo(consumo);
        setPrecio(precio);
        peso = 2;
    }

    public Electrodomestico(String color, int consumo, double precio, double peso){
        setColor(color);
        setConsumo(consumo);
        setPrecio(precio);
        setPeso(peso);
    }
    //----------------
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre( String nombre){
        this.nombre =nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getConsumo() {
        return consumo;
    }
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //--- Metodos sin set!
    public String getBajoConsumo(){
        if(getConsumo()<45){
            return "Bajo consumo";
        }else{
            return "Alto consumo";
        }
    }
    // ●  Calcular el balance, el mismo es el resultado de dividir el costo por el peso
    public double getBalance(){
        return (getPrecio()/getPeso());
    }
    // ●  Indicar si un producto es de alta gama, el balance es mayor que 3
    public String getAltaGama(){
        if(getBalance()>3){
            return "Es alta gama";
        }else{
            return "No es alta gama";
        }
    }
}
