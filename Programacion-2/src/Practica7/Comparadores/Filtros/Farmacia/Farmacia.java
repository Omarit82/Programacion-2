package Practica7.Comparadores.Filtros.Farmacia;
import java.util.ArrayList;

public class Farmacia {
    ArrayList<Medicamento> medicamentos;
    
    public Farmacia(){
        medicamentos = new ArrayList<Medicamento>();
    }

    public void addMedicamento(Medicamento m){
        medicamentos.add(m);
    }

    public ArrayList<Medicamento> buscar(String laboratorio){
        ArrayList<Medicamento> auxiliar = new ArrayList<>();

        for (Medicamento m : auxiliar) {
            if(m.getLaboratorio().equals(laboratorio));
                auxiliar.add(m);
        }
        return auxiliar;

    }
}
