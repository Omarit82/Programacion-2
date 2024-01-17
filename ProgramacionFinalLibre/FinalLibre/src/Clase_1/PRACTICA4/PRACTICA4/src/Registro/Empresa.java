package Registro;
import java.util.ArrayList;
public class Empresa {
    private ArrayList<Persona> personal;

    public Empresa(){
        personal = new ArrayList<>();
    }

    public void agregarPersonal(Persona nueva){
        if(!personal.contains(nueva)){
            personal.add(nueva);
        }
    }

    public void listarPersonal(){
        for (Persona persona : personal) {
            System.out.println(persona);
        }
    }

}

