package Farmacia;

public class ComparadorNombre extends ComparadorMedicamentos {
    
    public ComparadorNombre(){}

    public ComparadorNombre(ComparadorMedicamentos siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Medicamento med1, Medicamento med2){
        return med1.getNombre().compareTo(med2.getNombre());
    }
}
