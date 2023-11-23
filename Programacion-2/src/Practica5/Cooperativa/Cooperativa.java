package Practica5.Cooperativa;
import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<String> mineralesInteres;

    public Cooperativa(){
        mineralesInteres = new ArrayList<String>();
    }

    public void addMineralInteres(String m){
        mineralesInteres.add(m);
    }
    
    public boolean loteEspecial(Lote l){
        for (String mineral : mineralesInteres) {
            if(!l.contieneMineral(mineral)){
                return false;
            }
        }
        return true;
    }
}
