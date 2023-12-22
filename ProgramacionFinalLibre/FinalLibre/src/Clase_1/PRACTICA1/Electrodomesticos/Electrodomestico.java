package Clase_1.PRACTICA1.Electrodomesticos;

public class Electrodomestico {
    /* Atributos */

    private String nombre;
    private double precioBase = 100;
    private String color = "gris plata";
    private int consumoElectrico = 10;
    private double peso =2;
    public static final int BAJO_CONSUMO = 45;
    public static final int ALTA_GAMA = 3;

    /* Constructores */

    public Electrodomestico(String nombre){
        this.nombre = nombre;
    }

    public Electrodomestico(String nombre,double precioBase){
        this(nombre);
        this.precioBase = precioBase;
    }
    public Electrodomestico(String nombre,double precioBase, String color){
        this(nombre,precioBase);
        this.color = color;
    }
    public Electrodomestico(String nombre,double precioBase, String color,int consumoElectrico){
        this(nombre,precioBase,color);
        this.consumoElectrico = consumoElectrico;
    }
    public Electrodomestico(String nombre,double precioBase,String color,int consumoElectrico,double peso){
        this(nombre,precioBase,color,consumoElectrico);
        this.peso = peso;
    }
    
    /* ATRIBUTOS GETTERS & SETTERS */

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(int consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /* Atributos Funcionalidades */

    public boolean bajoConsumo(){
        if(getConsumoElectrico() < BAJO_CONSUMO){
            return true;
        }else{
            return false;
        }
    }

    public double getBalance(){
        return getPrecioBase()/getPeso();
    }

    public boolean altaGama(){
        boolean resultado = false;
        if(getBalance() > ALTA_GAMA){
            return resultado;
        }
        return resultado;
    }
}
