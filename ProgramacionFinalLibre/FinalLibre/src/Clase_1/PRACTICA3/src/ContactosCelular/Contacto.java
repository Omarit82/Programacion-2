package ContactosCelular;

import java.time.LocalDate;

public class Contacto {
    /*Atributos */
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private long numeroTelefono;
    private String direccion;
    private String email;
    private String ciudad;

    public Contacto(String ciudad,String nombre, String apellido, long numeroTelefono, String direccion, String email,int dia,int mes,int anio) {
        this.ciudad =ciudad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
    

    public int getEdad(){
        LocalDate fechaActual = LocalDate.now();
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if(fechaActual.getMonthValue() > fechaNacimiento.getMonthValue()){
            /*ya cumplio años */
            return anios;
        }else if(fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()){
            /*aun no cumplió años */
            return anios-1;
        }else{
            /*esta en el mes de su cumpleaños */
            if(fechaActual.getDayOfMonth() >= fechaNacimiento.getDayOfMonth()){
                return anios;
            }else{
                return anios-1;
            }
        }
    }

    @Override
    public String toString() {
        return "Contacto:\n Nombre: " + nombre + ",\n apellido: " + apellido + ",\n numeroTelefono: " + numeroTelefono
        +",\n Edad: "+getEdad()+",\n Ciudad: "+ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override 
    public boolean equals(Object obj){
        try {
            Contacto nuevo = (Contacto) obj;
            if((nuevo.getNombre().equals(this.getNombre()))&&(nuevo.getApellido().equals(this.getApellido()))&&(nuevo.getNumeroTelefono() == this.getNumeroTelefono())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
