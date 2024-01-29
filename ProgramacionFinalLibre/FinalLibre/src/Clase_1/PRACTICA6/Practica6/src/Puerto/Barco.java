package Puerto;

public class Barco extends Transporte{
    private int capacidad;
    private String matricula;

    public Barco(String matricula, int capacidad){
        this.capacidad = capacidad;
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
