package Seleccion;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fechaNacimiento;
    private String [] estados = {"Viajando","En pais de origen"}; 
    private String estado;
    private boolean concentrando;

    
    public Integrante(String nombre, String apellido, int pasaporte,int anio,int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        fechaNacimiento = LocalDate.of(anio, mes, dia);
        estado = estados[2];
        this.concentrando = false;
    }
    public boolean disponible(){
        return (!this.isConcentrando()&&(this.getEstado().equals(estados[1])));
    }
    
    public boolean isConcentrando() {
        return concentrando;
    }

    public void setConcentrando(boolean concentrando) {
        this.concentrando = concentrando;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(int index){
        if(index>=0 && index<2){
            estado = estados[index];
        }else{
            System.out.println("Error, estado inexistente");
        }
    }

    public LocalDate getFechaNac(){
        return fechaNacimiento;
    }

    public void setFechaNac(int anio,int mes,int dia){
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
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
    public int getPasaporte() {
        return pasaporte;
    }
    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public boolean equals(Object integrante){
        try {
            Integrante auxiliar = (Integrante) integrante;
            if(this.getApellido().equals(auxiliar.getApellido())&&this.getNombre().equals(auxiliar.getNombre())&&this.getPasaporte() == auxiliar.getPasaporte()){
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString(){
        return "NOMBRE: "+getNombre()+" "+getApellido()+" PASAPORTE: "+getPasaporte()+" FECHA NACIMIENTO: "+getFechaNac();
    }
    
}
