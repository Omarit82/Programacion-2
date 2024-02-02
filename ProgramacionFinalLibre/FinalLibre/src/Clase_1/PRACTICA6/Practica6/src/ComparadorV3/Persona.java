package ComparadorV3;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apelllido;
    private int dni;
    private int edad;
    
    public Persona(String nombre, String apelllido, int dni, int edad) {
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*¨Puedo hacer esto porque el string ya es comparable! */
    @Override
    public int compareTo(Persona nuevaPersona) {
        return this.getDni()-nuevaPersona.getDni();
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apelllido=" + apelllido + ", DNI=" + dni + ", Edad=" + edad + "\n";
    }

    

}
