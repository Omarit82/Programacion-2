package JuegoPersonajes;
/*Cada personaje del
juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una
de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33. */
public class Personaje {
    /*Atributos*/
    private String nombreReal;
    private String nombreSuper;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private int peso;
    private int altura;
    private int edad;

    public Personaje(String nombreReal, String nombreSuper, int visionNocturna, int velocidad, int fuerza, int peso,int altura, int edad) {
        this.nombreReal = nombreReal;
        this.nombreSuper = nombreSuper;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personaje [nombreReal=" + nombreReal + ", nombreSuper=" + nombreSuper + ", visionNocturna="
                + visionNocturna + ", velocidad=" + velocidad + ", fuerza=" + fuerza + ", peso=" + peso + ", altura="
                + altura + ", edad=" + edad + "]";
    }

    
    
}
