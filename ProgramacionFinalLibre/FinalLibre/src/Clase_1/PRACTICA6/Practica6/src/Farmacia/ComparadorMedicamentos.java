package Farmacia;
import java.util.Comparator;
public abstract class ComparadorMedicamentos implements Comparator<Medicamento>{
    
    private ComparadorMedicamentos siguiente;

    public ComparadorMedicamentos(){
        siguiente = null;
    }

    public ComparadorMedicamentos(ComparadorMedicamentos siguiente){
        this.siguiente = siguiente;
    }

    public abstract int comparando(Medicamento med1, Medicamento med2);
    @Override
    public int compare(Medicamento med1,Medicamento med2){
        int aux = comparando(med1, med2);
        if(aux == 0){
            if(siguiente != null){
                siguiente.compare(med1, med2);
            }else{
                return 0;
            }
        }
        return aux;
    }
}
