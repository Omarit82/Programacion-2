package CandyCrush;
/*Cada ficha del tablero posee una fortaleza (golpes necesarios para destruirla), ocupa
un espacio del tablero (medido en cantidad de casilleros), y tiene un poder de destrucción.
Por ejemplo el “chocolate” tiene una fortaleza de 1, ocupa 1 casillero del tablero y tiene
poder de destrucción 0; la “piedra” tiene fortaleza 6, ocupa 1 casillero de tablero y tiene
poder de destrucción 0; el “caramelo a rayas” ocupa 1 casillero del tablero, tiene fortaleza 1,
y un poder de destrucción de 10; la “torta” ocupa 4 casilleros, tiene fortaleza 8 y poder de
destrucción 4, y así con cada una de las distintas fichas. También existen fichas especiales
cuyo poder de destrucción se calcula como la fortaleza de la ficha, dividido el espacio que
ocupan. */
public class Ficha {
    private String nombre;
    private int cantidadCasilleros;
    private int fortaleza;
    private int poderDestruccion;

    public Ficha(int cantidadCasilleros,int fortaleza, int poderDestruccion, String nombre){
        this.nombre = nombre;
        this.cantidadCasilleros = cantidadCasilleros;
        this.fortaleza = fortaleza;
        this.poderDestruccion = poderDestruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    public void setCantidadCasilleros(int cantidadCasilleros) {
        this.cantidadCasilleros = cantidadCasilleros;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    
}
