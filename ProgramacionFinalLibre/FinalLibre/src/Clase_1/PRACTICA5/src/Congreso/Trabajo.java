package Congreso;
import java.util.ArrayList;
public class Trabajo {

    protected ArrayList<String>tags;
    private String titulo;
    
    public Trabajo(String titulo){
        this.titulo = titulo;
        tags = new ArrayList<>();
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void agregarTag(String tag){
        tag = tag.toLowerCase();
        if(!tags.contains(tag)){
            tags.add(tag);
        }
    }

    public boolean tieneTag(String tag){
        tag = tag.toLowerCase();
        return tags.contains(tag);
    }

    public boolean puedeEvaluar(Evaluador ee){
        boolean cumple = true;
        for (String palabra : tags) {
            if(!ee.tieneTag(palabra)){
                cumple = false;
            }
        }
        return cumple;
    }
    @Override
    public String toString(){
        return "TITULO: "+getTitulo();
    }
}
