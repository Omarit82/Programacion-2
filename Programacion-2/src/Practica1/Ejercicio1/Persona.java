package Practica1.Ejercicio1;

import java.time.LocalDate;

public class Persona {

    //----Atributos----
    private int dni;
    private String name;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private char sex;
    private int year;
    private int month;
    private int day;
    //private LocalDate birthDate = LocalDate.of(getYear(),getAge(),getDay());
    //----Constructor----
    public Persona(int dni){
        this.dni = dni;
        day = 1;
        month = 1;
        year = 2000;
        sex = 'f';
        name = "N";
        lastName = "N";
        weight = 1;
        height = 1;
    }
    public Persona(int dni,String name,String lastName){
        this.dni = dni;
        setName(name);
        setLastName(lastName);
        day = 1;
        month = 1;
        year = 2000;
        sex = 'f';
        weight = 1;
        height = 1;
    }
    public Persona(int dni,String name,String lastName,int year,int month,int day){
        this.dni = dni;
        setName(name);
        setLastName(lastName);
        setYear(year);
        setMonth(month);
        setDay(day);
        sex = 'f';
        weight = 1;
        height = 1;
    }
    public Persona(int dni,String name,String lastName,int year,int month,int day,char sex){
        this.dni = dni;
        setName(name);
        setLastName(lastName);
        setYear(year);
        setMonth(month);
        setDay(day);
        setSex(sex);
        weight = 1;
        height = 1;
    }
    public Persona(int dni,String name,String lastName,int year,int month,int day,char sex,double weight,double height){
        this.dni = dni;
        setName(name);
        setLastName(lastName);
        setYear(year);
        setMonth(month);
        setDay(day);
        setSex(sex);
        setWeight(weight);
        setHeight(height); 
    }

    //----Metodos----
    
    public String getName(){
        return name;
    }
    public int getDni() {
        return dni;
    }
    public void setName(String name){
        this.name = name;
    }
    //----------------
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //----------------
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //-----------------
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //-----------------
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //-----------------
    public char isSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    //------------------
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //------------------
    public int getMes() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    //------------------
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    //----Metodos de calculo sin set!----
    public LocalDate getBirthDate(){
        return LocalDate.of(getYear(),getMes(),getDay());
    }

    // ● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice de masa corporal el cual es peso / altura2
    public double getIndiceMasaCorporal(){
        if (this.height != 0){
            return  (this.weight/(Math.pow(this.height, 2)));
        }else {
            return 0;
        }
    }
    // ● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
    public String getEnForma(){
        if (getIndiceMasaCorporal()<18.5){
            return "Bajo en peso";
        }else if (getIndiceMasaCorporal()<25){
            return "Peso Saludable";
        }else {
            return "Sobrepeso";
        }
    }

    //LocalDate ld = LocalDate.now();
    // ● Saber si está cumpliendo años.

    public String getCumpleannos(){
        LocalDate d1 = LocalDate.now();
        int mes = d1.getMonthValue();
        
        if((d1.getDayOfMonth() == getDay())&&(getMes() == mes)){
            return "Feliz cumpleaños!";
        } else {
            return "Feliz no cumpleannos!";
        }       
    }

    public String getMayorEdad(){
        LocalDate d2 = LocalDate.now();
        int anno = d2.getYear();
        if ((anno-getYear()>=18)){
            if (d2.getMonthValue() <= getMes() ){
                if((d2.getDayOfMonth() <= getDay())){
                    return "Es mayor de edad";
                }else{
                    return "Aun le faltan dias para llegar a la mayoria de edad";
                }   
            }else {
                return "Aun le faltan meses para llegar a la mayoria de edad";
            }
        }else{
            return "Aun no es mayor de edad";
        }
    }

    public String getInfo(){
        return "Nombre: "+getName()+" - Apellido: "+getLastName()+" - DNI: "+getDni();
    }
}