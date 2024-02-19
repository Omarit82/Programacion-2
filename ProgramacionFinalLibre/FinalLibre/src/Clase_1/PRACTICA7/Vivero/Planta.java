package Vivero;
import java.util.ArrayList;
public class Planta {
    /*Cada planta posee un nombre científico, una lista de nombres vulgares, una
    clasificación superior, una familia y una clase. Las plantas pueden prosperar mejor en interior
    o en exterior, tienen un requerimiento de sol que se indica con un número entero del 1 al 10
    (1 para sombra, hasta 10 para sol pleno) y un requerimiento de agua que se indica de la
    misma manera (1 para riesgo escaso y 10 para riego abundante). */
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private boolean interior;
    private int requerimientoSol = 0;
    private int requerimientoRiego = 0;

    public Planta(String nombreCientifico, String clasificacion, String familia, String clase, boolean interior,
        int requerimientoSol, int requerimientoRiego) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.interior = interior;
        setRequerimientoSol(requerimientoSol);
        setRequerimientoRiego(requerimientoRiego);
        nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public int getRequerimientoSol() {
        return requerimientoSol;
    }

    public void setRequerimientoSol(int requerimientoSol) {
        if(requerimientoSol>0 && requerimientoSol<11){
            this.requerimientoSol = requerimientoSol;
        }
    }

    public int getRequerimientoRiego() {
        return requerimientoRiego;
    }

    public void setRequerimientoRiego(int requerimientoRiego) {
        if(requerimientoRiego>0 && requerimientoRiego<11){
            this.requerimientoRiego = requerimientoRiego;
        }
    }

    public void addNombreVulgar(String nombreVulgar){
        nombreVulgar = nombreVulgar.toUpperCase();
        if(!nombresVulgares.contains(nombreVulgar)){
            nombresVulgares.add(nombreVulgar);
        }
    }

    public boolean tieneNombreVulgar(String nombre){
        nombre = nombre.toUpperCase();
        if(nombresVulgares.contains(nombre)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Planta [nombreCientifico=" + getNombreCientifico() + ", nombresVulgares=" + nombresVulgares
                + ", clasificacion=" + getClasificacion() + ", familia=" + getFamilia() + ", clase=" + getClase() + ", interior="
                + isInterior() + ", requerimientoSol=" + requerimientoSol + ", requerimientoRiego=" + requerimientoRiego
                + "]";
    }

    
}
