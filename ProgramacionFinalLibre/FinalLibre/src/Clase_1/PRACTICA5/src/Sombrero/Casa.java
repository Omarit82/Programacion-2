package Sombrero;
/* Cada una de las casas cuenta con un conjunto de cualidades que deben tener los alumnos para poder
pertenecer a dicha casa y una cantidad máxima de alumnos que pueden aceptar

Y por último, hay casas que a lo largo de su historia se han encontrado enemistadas. En
el caso en el que la casa tenga una enemistad con otra, además de exigir al alumno tener todas
las cualidades, se debe controlar que dicho alumno no pueda ser aceptado por la casa
enemiga
*/
import java.util.ArrayList;

public class Casa {

    private String nombre;
    public static final int QTY_ALUMNOS = 2;
    private ArrayList <String> cualidades;
    protected Alumno [] alumnos;
    private ArrayList<Casa> enemistadas;
    
    public Casa(String nombre){
        this.nombre = nombre;
        cualidades = new ArrayList<String>();
        alumnos  = new Alumno[QTY_ALUMNOS];
        enemistadas = new ArrayList<>();
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCasaEnemiga(Casa enemiga){
        if(!enemistadas.contains(enemiga)){
            enemistadas.add(enemiga);
        }
    }

    public boolean esEnemiga(Casa enemiga){
        if(enemistadas.contains(enemiga)){
            return true;
        }else{
            return false;
        }
    }

    public void agregarCualidad(String nueva){
        if(!cualidades.contains(nueva)){
            cualidades.add(nueva);
        }
    }

    public boolean alumnoAceptable(Alumno alumno){
        boolean aceptado = true;
        for (String cualidad : cualidades) {
            if(!alumno.tieneCualidad(cualidad)){
                aceptado = false;
            }
        }
        /* HASTA ACA FUE ACEPTADO O NO A LA ACTUAL CASA..SI FUE ACEPTADO DEBEMOS CHEQUEAR CON LAS CASAS ENEMIGAS */
        if(aceptado){
            boolean check = true;
            for (Casa casaEnemiga : enemistadas) {
                if (casaEnemiga.alumnoAceptable(alumno)){
                    check = false;
                }
            }
            aceptado = check;
        }
        return aceptado;
    }

    public void agregarAlumno(Alumno nuevoAlumno){
        /* deben tener todas las cualidades requeridas. */
        if(alumnos[QTY_ALUMNOS-1] != null){
            if(alumnoAceptable(nuevoAlumno)){
                System.out.println("Alumno aceptado");
                int i=0;
                while(i<alumnos.length && alumnos[i]!=null){
                    i++;
                }
                if(i<alumnos.length){
                    alumnos[i] = nuevoAlumno;
                }
            }
        }else{
            System.out.println("Casa llena");
        }
    }

    public void listaAlumnos(){
        if(alumnos.length>0){
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
    @Override
    public boolean equals(Object obj){
        try {
            Casa aux = (Casa) obj;
            if(aux.getNombre().equals(this.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString(){
        return getNombre();
    }

}
