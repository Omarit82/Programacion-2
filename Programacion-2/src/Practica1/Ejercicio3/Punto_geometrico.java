package Practica1.Ejercicio3;

public class Punto_geometrico {
 /**        3 Elementos Geométricos
Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)
*/

//Atributos

private double coordenadaX;
private double coordenadaY;

//Constructor
public Punto_geometrico() {
    coordenadaX = 0;
    coordenadaY = 0;
}

public Punto_geometrico(double coordenadaX, double coordenadaY){
    setCoordenadaX(coordenadaX);
    setCoordenadaY(coordenadaY);
}

//Metodos
public double getCoordenadaX() {
    return coordenadaX;
}
public double getCoordenadaY() {
    return coordenadaY;
}
public void setCoordenadaX(double coordenadaX) {
    this.coordenadaX = coordenadaX;
}
public void setCoordenadaY(double coordenadaY) {
    this.coordenadaY = coordenadaY;
}

/**         La funcionalidad que posee la clase es la siguiente:
● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).
*/ 
public String getDesplazamiento(double deltaX, double deltaY){
    setCoordenadaX(getCoordenadaX()+deltaX);
    setCoordenadaY(getCoordenadaY()+deltaY);
    return (coordenadaX+","+coordenadaY);
}

/*
● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
Distancia2 = ( X1 – X2 )2 + (Y1 – Y2)2
La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.
*/
public double getDistancia(double nuevoX, double nuevoY){
    double distancia = Math.sqrt(Math.pow((getCoordenadaX()-nuevoX), 2)+Math.pow((getCoordenadaY()-nuevoY), 2));
    return distancia;
}
/*
La funcionalidad que debe proveer un rectángulo es la siguiente
● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y.
● Calcular el Área del rectángulo.
● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro.
● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado.
● Determinar el largo del lado superior.
● Determinar si está acostado o parado (si el alto es más que el ancho).
 */  




}
