package Cooperativa;
import java.util.ArrayList;
public class Cooperativa {
    private ArrayList<String> mineralesPrimarios;

    public Cooperativa(){
        mineralesPrimarios = new ArrayList<>();
    }

    public void addMineralPrimario(String mineral){
        mineral = mineral.toLowerCase();
        mineralesPrimarios.add(mineral);
    }
    
    public boolean esEspecial(Lote lote){
        boolean especial = true;
        ArrayList<String>min = lote.minPresentes();
        for (String mineralPresente : min) {
            if(!mineralesPrimarios.contains(mineralPresente)){
                especial = false;
            }
        }
        return especial;
    }

}
