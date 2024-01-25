package Puerto;

public class TransporteCarga {
    private int capacidad;
    private String matricula;

    public TransporteCarga(String matricula, int capacidad){
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
