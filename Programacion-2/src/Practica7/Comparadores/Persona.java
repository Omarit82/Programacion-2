package Practica7.Comparadores;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Persona p) {
        return this.getApellido().compareTo(p.getApellido());
    }

    public String toString(){
        return "Apellido: "+this.getApellido()+" | Nombre: "+this.getNombre()+" | Edad: "+this.getEdad()+"||\n";
    }

    
}
