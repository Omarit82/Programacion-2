package Farmacia;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Medicamento> medicamentos;

    public Stock(){
        medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento med1){
        if(!medicamentos.contains(med1)){
            medicamentos.add(med1);
        }
    }

    public ArrayList<Medicamento> getMedLaboratorio(String laboratorio){
        ArrayList<Medicamento> aux = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            if(medicamento.getLaboratorio().equals(laboratorio)){
                aux.add(medicamento);
            }
        }
        return aux;
    }
}
