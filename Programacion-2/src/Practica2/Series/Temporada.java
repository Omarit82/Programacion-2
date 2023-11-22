package Practica2.Series;
import java.util.ArrayList;

public class Temporada {
    private int idTemporada;
    private ArrayList<Episodio>episodios;

    public Temporada(int idTemporada){
        this.idTemporada=idTemporada;
        episodios=new ArrayList<Episodio>();
    }

    public void setIdTemporada(int id){
        idTemporada=id;
    }

    public int getIdTemporada(){
        return idTemporada;
    }

    public int cantidadEpisodios(){
        return episodios.size();
    }

    public void addEpisodio(Episodio ep){
        episodios.add(ep);
    }

    public int episodiosVistos(){
        int total=0;
        for (Episodio episodio : episodios) {
            if (episodio.isFlagVisto()){
                total++;
            }
        }
        return total;
    }

    public double getPromedio(){
        int total = 0;
        int contadorEpisodios = 0;
        for (Episodio episodio : episodios) {
            if(episodio.isFlagVisto()){
                contadorEpisodios++;
                total += episodio.getCalificacion();
            }
        }
        return (double)total/contadorEpisodios;
    }
    
}
