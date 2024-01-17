package Registro;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    public String toString(){
        return "Nombre: "+getNombre()+"\n"+"Apellido: "+getApellido()+"\n"+"Edad: "+getEdad()+"\n";
    }

    @Override
    public boolean equals(Object nuevo){
        try {
            Persona pp = (Persona) nuevo;
            if(pp.getApellido().equals(this.getApellido())&&pp.getNombre().equals(this.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
           return false;
        }
    }

}
