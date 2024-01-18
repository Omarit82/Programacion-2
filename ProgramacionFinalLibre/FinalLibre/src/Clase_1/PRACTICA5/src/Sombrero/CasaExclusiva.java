package Sombrero;

/*Algunas casas no se contentan con que los alumnos tengan todas las cualidades que
requieren, sino que además en un afán de conservar los linajes de sangre pura, también
exigen que el alumno cuente con un familiar que pertenezca en este momento a la misma
casa.  */

public class CasaExclusiva extends Casa {

    public CasaExclusiva(String nombre){
        super(nombre);
    }
    
    @Override
    public void agregarAlumno(Alumno nuevoAlumno){
        if(super.alumnoAceptable(nuevoAlumno)){
            boolean tieneFamiliar = true;
            for (Alumno alumno : alumnos) {
                if(!nuevoAlumno.esFamiliar(alumno)){
                    tieneFamiliar= false;
                }
            }
            if(tieneFamiliar){
                super.agregarAlumno(nuevoAlumno);
            }
        }
    }
    
}
