package Practica1.Ejercicio1;

import java.time.LocalDate;
import java.time.Month;

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
        setDni(dni);
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
        setDni(dni);
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
        setDni(dni);
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
        setDni(dni);
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
        setDni(dni);
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
    public void setDni(int dni) {
        this.dni = dni;
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
        Month mes = d1.getMonth();
        int mesNumerico = 0;
        switch (mes) {
            case JANUARY: mesNumerico = 1; break;
            case FEBRUARY: mesNumerico = 2; break;
            case MARCH: mesNumerico = 3; break;
            case APRIL: mesNumerico = 4; break;
            case MAY: mesNumerico = 5; break;
            case JUNE: mesNumerico = 6; break;
            case JULY: mesNumerico =  7; break;
            case AUGUST: mesNumerico = 8; break;
            case SEPTEMBER: mesNumerico = 9; break;
            case OCTOBER: mesNumerico = 10; break;
            case NOVEMBER: mesNumerico = 11; break;
            case DECEMBER: mesNumerico = 12; break;
        }
        if((d1.getDayOfMonth() == getDay())&&(getMes() == mesNumerico)){
            return "Feliz cumpleaños!";
        } else {
            return "Feliz no cumpleannos!";
        }       
    }
}