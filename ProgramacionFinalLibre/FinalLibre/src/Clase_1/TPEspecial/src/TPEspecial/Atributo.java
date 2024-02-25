package TPEspecial;
public class Atributo implements Comparable<Atributo>{
    /*--Genero la clase Atributo porque las cartas pueden tener una cantidad variable de estos. Y porque tienen atributos propios. */
    private String nombre;
    private double valorNumerico;

    public Atributo(String nombre, double valorNumerico){
        this.nombre = nombre;
        this.valorNumerico = valorNumerico;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setValorNumerico(double valorNumerico){
        this.valorNumerico = valorNumerico;
    }
    public double getValorNumerico(){
        return valorNumerico;
    }
    @Override
    public boolean equals(Object object){
        try {
            Atributo auxiliar = (Atributo)object;
            if(this.getNombre().equals(auxiliar.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public int compareTo(Atributo atributo) {
        return atributo.getNombre().compareTo(this.getNombre());
    }
    @Override
    public String toString() {
        return "Atributo: " + nombre + ", Valor: " + valorNumerico + "\n";
    }
}
