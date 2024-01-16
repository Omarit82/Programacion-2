package Registro;

public class Usuario extends Persona {

    private String nombreUsuario;
    private String password;

    public Usuario(String nombre, String apellido, int edad,String nombreUsuario,String password) {
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        String aux = super.toString();
        return aux+"Nombre de usuario: "+getNombreUsuario()+"\n"+"Password: "+getPassword()+"\n";
    }
}
