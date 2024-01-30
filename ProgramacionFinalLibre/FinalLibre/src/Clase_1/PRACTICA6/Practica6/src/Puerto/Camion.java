package Puerto;

public class Camion extends Transporte{
    
    private int fechaCarga;
    private double capacidad;
    private String matricula;

    public Camion(String matricula, double capacidad, int fechaCarga) {
        this.fechaCarga = fechaCarga;
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public int getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(int fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*Comparo un camion respecto otro camion dado. */
    @Override
    public boolean esMayor(Transporte tt){
        return this.getFechaCarga() < ((Camion) tt).getFechaCarga();
    }

    @Override
    public String toString(){
        return getMatricula()+" | "+getCapacidad()+" | "+getFechaCarga()+"\n";
    }
    
}
