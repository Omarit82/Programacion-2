package Encuestas;

public class Persona {
    /*Atributos */
    private String nombre;
    private int dni;

    /*Constructor */
    public Persona(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    /*Metodos */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return dni;
    }
    
}
