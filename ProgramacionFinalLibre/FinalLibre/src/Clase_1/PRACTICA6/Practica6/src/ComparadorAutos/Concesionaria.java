package ComparadorAutos;

public class Concesionaria {
    private String name;
    private Automoviles autos;
    
    public Concesionaria(String name){
        this.name = name;
        autos = new Automoviles();
    }

    /*Agrega un auto */

    public void addAuto(Auto a1){
        autos.agregarAuto(a1);
    }

    public String getName(){
        return name;
    }

    public Auto returnMasNuevoMenosKm(){
        return autos.masNuevoMenosKm();
    }

    public void returnColor(String color){
        color = color.toLowerCase();
        System.out.println(autos.retColor(color));
    }

    public void returnAnio(){
        System.out.println(autos.porAnio());
    }
    public void returnKm(){
        System.out.println(autos.porKm());
    }
}
