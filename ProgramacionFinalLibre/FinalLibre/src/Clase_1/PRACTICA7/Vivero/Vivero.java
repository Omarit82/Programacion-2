package Vivero;

import java.util.ArrayList;

import Vivero.Criterios.Criterio;

/*Un vivero necesita un sistema que le permita cargar fichas de las diferentes plantas que
vende. 

El sistema debe ser útil para los administradores del vivero para, por ejemplo, cuando llega
un cliente poder ofrecerle las plantas que cumplen con sus requerimientos:
a) Todas las plantas cuyo nombre científico incluya la palabra “auereum” LISTO
b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”LISTO
c) Todas las plantas cuya clasificación sea “Crassula”LISTO
d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
g) Cualquier combinación lógica de las formas anteriores */
public class Vivero {

    private ArrayList<Planta> plantas;

    public Vivero(){
        plantas = new ArrayList<>();
    }

    /*agregar planta */
    public void agregarPlanta(Planta planta){
        plantas.add(planta);
    }

    public ArrayList<Planta> buscarPlantas(Criterio criterio){
        ArrayList<Planta> auxiliar = new ArrayList<>();
        for (Planta planta : plantas) {
            if(criterio.cumple(planta)){
                auxiliar.add(planta);
            }
        }
        return auxiliar;
    }
    
}
