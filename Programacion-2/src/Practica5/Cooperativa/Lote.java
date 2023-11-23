package Practica5.Cooperativa;
import java.util.ArrayList;
public class Lote {

    private double superficie;
    private ArrayList<String>minerales;

    public Lote(double superficie) {
        this.superficie = superficie;
        minerales=new ArrayList<>();
    }

    public void addMineral(String m){
        minerales.add(m);
    }
    
    public boolean contieneMineral(String m){
        if(minerales.contains(m)){
            return true;
        }else{
            return false;
        }
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    
}
