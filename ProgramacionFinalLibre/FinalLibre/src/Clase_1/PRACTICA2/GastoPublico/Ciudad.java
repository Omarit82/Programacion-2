package Clase_1.PRACTICA2.GastoPublico;

public class Ciudad {

    private String nombre;
    private int cantidadHabitantes;
    /*Los impuestos estan dados en porcentaje. */
    private double impuesto1 = 2000;
    private double impuesto2 = 3000;
    private double impuesto3 = 1500;
    private double impuesto4 = 7500;
    private double impuesto5 = 5000;
    private double gastos;


    public Ciudad(String nombre,int cantidadHabitantes,double gastos){
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.gastos = gastos;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidadHabitantes(){
        return cantidadHabitantes;
    }
    public void setCantidadHabitantes(int cantidadHabitantes){
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public double getImpuesto1() {
        return impuesto1;
    }

    public void setImpuesto1(double impuesto1) {
        this.impuesto1 = impuesto1;
    }

    public double getImpuesto2() {
        return impuesto2;
    }

    public void setImpuesto2(double impuesto2) {
        this.impuesto2 = impuesto2;
    }

    public double getImpuesto3() {
        return impuesto3;
    }

    public void setImpuesto3(double impuesto3) {
        this.impuesto3 = impuesto3;
    }

    public double getImpuesto4() {
        return impuesto4;
    }

    public void setImpuesto4(double impuesto4) {
        this.impuesto4 = impuesto4;
    }

    public double getImpuesto5() {
        return impuesto5;
    }

    public void setImpuesto5(double impuesto5) {
        this.impuesto5 = impuesto5;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

}
