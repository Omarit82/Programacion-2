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

    /*Comparo un barco con otro barco por su carga maxima. */
    @Override
    public boolean esMayor(Transporte tt){
        return this.getCapacidad()>((Barco)tt).getCapacidad();
    }

    @Override
    public String toString(){
        return getMatricula()+" | "+getCapacidad()+"\n";
    }
}
