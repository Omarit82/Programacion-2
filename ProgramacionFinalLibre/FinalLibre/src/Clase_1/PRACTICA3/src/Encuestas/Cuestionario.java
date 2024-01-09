package Encuestas;

/*1 Sistema de encuestas
Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
de terceros o para el gobierno. Una encuesta se compone de un conjunto de preguntas,
una persona encuestada y el empleado que realizo la encuesta. La compañía guarda
todas las encuestas realizadas. Los empleados cobran un plus por cantidad de encuestas
realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
cada empleado. Para evitar falsificación de datos, en la encuesta figura el número de
documento de la persona. Una misma persona no puede llenar dos veces la misma
encuesta, pero si una encuesta diferente.
Consejo: Diferenciar entre formulario a responder y formulario respondido.
Extra: ¿Qué cambiaría el eliminar la restricción de solo una encuesta por persona? */

import java.util.ArrayList;

public class Cuestionario {
    /*Atributos */
    private ArrayList<String> cuestionario; //Preguntas en forma de string

    /*Constructor */
    public Cuestionario(){
        cuestionario = new ArrayList<>();
    }

    /*Metodos - Agregar preguntas. */
    public void addPregunta(String pregunta){
        cuestionario.add(pregunta);
    }
    
}
