
import java.util.ArrayList;

public class Documento {
    
    /*Un documento tiene un título, una lista de autores, un contenido textual y una lista de
    palabras clave. */
    private String titulo;
    private String contenidoTextual;
    private ArrayList<String> autores;
    private ArrayList<String> keywords;

    public Documento (String titulo, String contenidoTextual){
        this.titulo = titulo;
        this.contenidoTextual = contenidoTextual;
        autores = new ArrayList<>();
        keywords = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public void addAutor(String autor){
        autor = autor.toLowerCase();
        if(!autores.contains(autor)){
            autores.add(autor);
        }
    }

    public void addKeywords(String word){
        word = word.toLowerCase();
        if(!keywords.contains(word)){
            keywords.add(word);
        }
    }

    public boolean tieneAutor(String autor){
        autor = autor.toLowerCase();
        if(autores.contains(autor)){
            return true;
        }else{
            return false;
        }
    }

    public boolean tienePalabra(String palabra){
        palabra = palabra.toLowerCase();
        int i = 0;
        boolean aux = false;
        while(!aux && i< keywords.size()){
            if(palabra.equals(keywords.get(i))){
                aux = true;
            }
            i++;
        }
        return aux;
    }

    public boolean tienePalabrasClave(){
        if(!keywords.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public int cantidadPalabras(){
        int contador=0;
        if(getContenidoTextual() != null && !getContenidoTextual().isEmpty()){
            String [] palabras = getContenidoTextual().split(" ");
            contador = palabras.length;
        }
        return contador;
    }

    @Override
    public boolean equals(Object obj){
        Documento aux = (Documento) obj;
        if(this.getTitulo().equals(aux.getTitulo())){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return getTitulo()+" "+autores+" "+"\n";
    }
}
