package ComparadorAutos;

public class Auto {
    private static int contador = 1;
    private int id; 
    private String marca;
    private String modelo;
    private int kilometros;
    private int anio;
    private String color;
    
    public Auto(String marca, String modelo, int kilometros, int anio, String color) {
        setMarca(marca);
        setModelo(modelo);
        this.kilometros = kilometros;
        setColor(color);
        this.anio = anio;
        this.id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toLowerCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toLowerCase();
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toLowerCase();
    }

    @Override
    public String toString() {
        return "Id: "+getId()+", Auto Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Kilometros: " + getKilometros() + ", Año: " + getAnio()
                + ", Color: " + getColor() + "\n";
    }

}
