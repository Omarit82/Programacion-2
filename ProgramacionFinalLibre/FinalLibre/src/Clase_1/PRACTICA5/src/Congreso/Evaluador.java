package Congreso;
import java.util.ArrayList;
public class Evaluador {
    private String nombre;
    private static int contador = 1; /* El id es unico. Lo declaro static y en el constructor le agrego uno */
    private int id;
    private ArrayList<String> temas;

    public Evaluador(String nombre){
        temas = new ArrayList<>();
        this.nombre = nombre;
        id=contador;
        contador++;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public void agregarTema(String tema){
        tema = tema.toLowerCase();
        temas.add(tema);
    }

    public boolean tieneTag(String tt){
        return temas.contains(tt);
    }

    @Override
    public String toString(){
        return "ID: "+getId()+", NOMBRE: "+getNombre();
    }
}
