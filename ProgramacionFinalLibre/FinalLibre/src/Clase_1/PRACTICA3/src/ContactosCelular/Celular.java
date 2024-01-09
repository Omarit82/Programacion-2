package ContactosCelular;
/*El celular muestra los contactos con su apellido y nombre, su edad y su número de
teléfono. También muestra la ciudad a la que pertenece el contacto. El celular muestra
información a modo de resumen donde se lista la totalidad de contactos, los contactos
repetidos y el promedio de edad de los contactos. Se considera un contacto repetido el
que posee mismo apellido y nombre, y número de teléfono. Asimismo, se debe poder
incorporar un listado de los contactos que poseen el mismo número de teléfono. */
import java.util.ArrayList;

public class Celular {

    private ArrayList<Contacto> contactos;
    
    public Celular(){
        contactos = new ArrayList<Contacto>();
    }

    public void addContacto(Contacto cc){
        contactos.add(cc);
    }

    public void showContactos(){
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
            System.out.println("_________________");
        }
    }

    public void resumen(){
        int promedio = 0;
        int contador = 0;
        for (Contacto contacto : contactos) {
            promedio += contacto.getEdad();
            contador++;
            System.out.println("Contacto: "+contacto.getApellido()+", "+contacto.getNombre());
        }
        System.out.println("Promedio de edades: "+((double)promedio/contador));
        System.out.println("_________________________________");
    }

    public void repetidos(){
        /*Para ser repetidos deben tener el mismo nombre el mismo apellido y el mismo numero de telefono. */
        /* */
        ArrayList<Contacto> repetidos = new ArrayList<>();
        for (Contacto contacto : contactos) {
            int contador = 0;
            for(int i =0 ; i<contactos.size();i++){
                if(contacto.equals(contactos.get(i))){
                    contador++;
                }
            }
            if((contador>1)&&(!repetidos.contains(contacto))){
                repetidos.add(contacto);
            }
        }

        /*Ahora debo imprimir los repetidos. */
        for (Contacto repe : repetidos) {
            System.out.println("Contacto repetido: "+repe.getNombre()+", "+repe.getApellido());
        }
    }

    public void mismoNumeroTel(){
        ArrayList<Contacto> sameNumber = new ArrayList<>();
        for (Contacto contacto : contactos) {
            int contador = 0;
            for(int i =0 ; i<contactos.size();i++){
                if(contacto.getNumeroTelefono() == contactos.get(i).getNumeroTelefono()){
                    contador++;
                }
            }
            if((contador>1)&&(!sameNumber.contains(contacto))){
                sameNumber.add(contacto);
            }
        }

        /*Ahora debo imprimir los repetidos. */
        for (Contacto repe : sameNumber) {
            System.out.println("Contacto con el mismo numero: "+repe.getNombre()+", "+repe.getApellido()+", "+repe.getNumeroTelefono());
        }
    }


}
