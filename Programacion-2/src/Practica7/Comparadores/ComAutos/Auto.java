package Practica7.Comparadores.ComAutos;

public class Auto {
    private String nombre;
    private int modelo;
    private String marca;
    private String color;

    public Auto (String nombre, int modelo, String marca, String color){
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Marca: "+ getMarca()+" - Modelo: "+getNombre()+" - Anio: "+getModelo()+" - Color: "+getColor()+"\n";
    }    
    
}
