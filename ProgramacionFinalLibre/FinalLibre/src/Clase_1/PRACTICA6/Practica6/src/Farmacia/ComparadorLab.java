package Farmacia;

public class ComparadorLab extends ComparadorMedicamentos {
    
    public ComparadorLab(){}
    public ComparadorLab(ComparadorMedicamentos siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Medicamento med1, Medicamento med2){
        return med1.getLaboratorio().compareTo(med2.getLaboratorio());
    }
}
