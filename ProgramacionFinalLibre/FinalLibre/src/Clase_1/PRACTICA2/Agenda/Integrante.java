package Clase_1.PRACTICA2.Agenda;

public class Integrante {
    private String nombre;
    private String apellido;
    private String email;
    private long nroTelefono;
    
    public Integrante(String nombre, String apellido, String email, long nroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nroTelefono = nroTelefono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(long nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String toString(){
        return "Integrante: "+nombre+" "+apellido+"\n"+"Email: "+email+"\n"+"Telefono: "+nroTelefono+"\n";
    }
    
}
