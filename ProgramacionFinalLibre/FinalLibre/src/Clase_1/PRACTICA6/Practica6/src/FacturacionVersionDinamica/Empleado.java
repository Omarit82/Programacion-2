package FacturacionVersionDinamica;
/*La forma en que se paga el sueldo a un empleado puede cambiar dinamicamente. */
public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private FormaPago fp;

    public Empleado(String nombre, String apellido, int dni, double sueldoFijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        fp = new FormaPagoFijo(sueldoFijo);
    }

    public void setFormaPago(FormaPago nuevaForma){
        fp = nuevaForma;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return fp.calcularSueldo();
    }
    
}
