package Practica7.Documentos;
import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> keywords;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        autores = new ArrayList<String>();
        keywords = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void addAutor(String autor){
        autores.add(autor);
    }
    public void addKeyword(String palabra){
        keywords.add(palabra);
    }

    public boolean findAutor(String autor){
        return autores.contains(autor);
    }

    public boolean findKeyword(String keyword){
        return keywords.contains(keyword);
    }

    public String toString(){
        return "Titulo: "+getTitulo()+" | Contenido: "+ getContenido()+"\n";
    }

    public boolean tieneKey(){
        if(keywords.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

}
