package Clase_1.PRACTICA1.Persona;

import java.time.LocalDate;

public class Persona {

    /*Atributos */

    private String nombre;
    private String apellido;
    private long dni;
    private int edad;
    private LocalDate fechaNacimiento;
    private String sexo;
    private double peso;
    private double altura;
    public static final int MAYOR_EDAD = 18;
    public static final double LIMITE_INFERIOR = 18.5;
    public static final double LIMITE_SUPERIOR = 25;
    public static final double EDAD_VOTO = 16;


    /*Constructores */

    public Persona (long dni){  //POR DEFECTO
        this.dni = dni;
        fechaNacimiento = LocalDate.of(2000, 1, 1);
        sexo ="Femenino";
        nombre ="N";
        apellido ="N";
        peso = 1;
        altura = 1;
    }

    public Persona(long dni,String nombre,String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        fechaNacimiento = LocalDate.of(2000, 1, 1);
        sexo ="Femenino";
        peso = 1;
        altura = 1;
    }

    public Persona(long dni, String nombre,String apellido,int year,int month,int day){
        fechaNacimiento = LocalDate.of(year, month, day); // Es importante poner este en la primer linea del constructor.
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        sexo ="Femenino";
        peso = 1;
        altura = 1;
    }

    public Persona(long dni, String nombre,String apellido,int year,int month,int day,String sexo){
        fechaNacimiento = LocalDate.of(year, month, day); // Es importante poner este en la primer linea del constructor.
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        setSexo(sexo);
        peso = 1;
        altura = 1;
    }

    public Persona(long dni, String nombre,String apellido,int year,int month,int day,String sexo,double peso){
        fechaNacimiento = LocalDate.of(year, month, day); // Es importante poner este en la primer linea del constructor.
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        setSexo(sexo);
        setPeso(peso);
        altura = 1;
    }

    public Persona(long dni, String nombre,String apellido,int year,int month,int day,String sexo,double peso,double altura){
        fechaNacimiento = LocalDate.of(year, month, day); // Es importante poner este en la primer linea del constructor.
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
    }

    /*Metodos */

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getDni() {
        return dni;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        if(sexo.equals("Masculino")){
            this.sexo = sexo;
        } else if (sexo.equals("Femenino")){
            this.sexo = sexo;
        }else{
            this.sexo = "Femenino";
        }
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso>0){
            this.peso = peso;
        } else {
            this.peso = 1;
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura>0){
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    /*Metodos - Responsabilidades */

    public double indiceMasaCorporal (){
        return peso / (Math.pow(altura,2));
    }
    public boolean estaSaludable(){
        boolean resultado = false;
        if(indiceMasaCorporal()>LIMITE_INFERIOR && indiceMasaCorporal()<LIMITE_SUPERIOR){
            resultado = true;
        }
        return resultado;
    }

    public boolean cumpleanios(){
        LocalDate actual = LocalDate.now();
        if((actual.getDayOfMonth() == fechaNacimiento.getDayOfMonth())&&( actual.getMonthValue() == fechaNacimiento.getMonthValue())){
            return true;
        }else{
            return false;
        }
    }

    public boolean esMayorEdad(){
        LocalDate actual = LocalDate.now();
        if(actual.getYear() - fechaNacimiento.getYear() > MAYOR_EDAD){
            return true;
        }else if (actual.getYear() - fechaNacimiento.getYear() < MAYOR_EDAD){
            return false;
        }else {
            if(actual.getMonthValue()>fechaNacimiento.getMonthValue()){
                return true;
            }else {
                if(actual.getMonthValue()<fechaNacimiento.getMonthValue()){
                    return false;
                }else if(actual.getDayOfMonth()>=fechaNacimiento.getDayOfMonth()){
                    return true;
                }else {
                    return false;
                }       
            }
        }
    }

    public boolean puedeVotar(){
        LocalDate actual = LocalDate.now();
        if(actual.getYear() - fechaNacimiento.getYear() > EDAD_VOTO){
            return true;
        }else if (actual.getYear() - fechaNacimiento.getYear() < EDAD_VOTO){
            return false;
        }else {
            if(actual.getMonthValue()>fechaNacimiento.getMonthValue()){
                return true;
            }else { 
                if(actual.getMonthValue()<fechaNacimiento.getMonthValue()){
                    return false;
                }else { 
                    if(actual.getDayOfMonth()>=fechaNacimiento.getDayOfMonth()){
                        return true;
                    }else {
                        return false;
                    }
                }
            }    
        }
    }

    public boolean esCoherente(){
        LocalDate actual = LocalDate.now();
        if(actual.getYear() - fechaNacimiento.getYear() == edad){
            return true;
        }else{
            if(actual.getYear() - fechaNacimiento.getYear() == edad+1){
                if(actual.getMonthValue() > fechaNacimiento.getMonthValue()){
                    return false;
                }else {
                    if (actual.getDayOfMonth() > fechaNacimiento.getDayOfMonth()){
                        return false;
                    }else{
                        return true;
                    }
                }
            }else{
                return false;
            }
        }
    }

    public String toString(){
        return nombre +", "+ apellido+"\n"+
        "DNI: "+dni+"\n"+
        "Fecha de nacimiento: "+fechaNacimiento+"\n"+
        "Edad: "+edad+"\n"+
        "Sexo: "+sexo+"\n"+
        "Altura: "+altura+", "+"Peso: "+peso;
    }

}
