package Practica7.Comparadores.ComAutos;

public class ComparadorModelo extends ComparadorAuto {
    private ComparadorAuto siguiente;

    public ComparadorModelo(){
        this.siguiente = null;
    }

    public ComparadorModelo(ComparadorAuto siguiente){
        super(siguiente);
    }

    public int comparar(Auto a1, Auto a2){
        return a1.getModelo() - a2.getModelo();
    }
    
}
