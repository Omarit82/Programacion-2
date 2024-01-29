package Puerto;
import java.util.ArrayList;

public abstract class ColaEspera {
    
    private ArrayList<Transporte> transportes;
    
    public ColaEspera(){
        transportes = new ArrayList<>();
    }

    public abstract void addEnCola(Transporte tt);
}
