/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author kdr
 * @version 4.0
 * @since 05-09-2017
 */
public class Persona {
    
    //private String rut;
    private String name;
    private String surname;
    //private int age;
    private int speed;
    private int distance;
    private int gram;
    private int cc;
    private int time;
    /**
     * 
     * @param rut
     * @param name
     * @param surname
     * @param age 
     * @param cc Centimetros cubicos de agua bebida.
     * @param time tiempo en llegar a la meta.
     */
    public Persona( String name, String surname) {
        //this.rut = rut;
        this.name = name;
        this.surname = surname;
        //this.age = age;
        this.speed = 0;
        this.distance = 0;
        this.gram = 0;
        this.cc = 0;
        this.time = 0;
    }
    
    /**
     * consytructor vacio
     */
    public Persona() {
        this.speed = 0;
        this.distance = 0;
        this.gram = 0;
        this.cc = 0;
    }
    
    /*
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }*/

    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /*
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    
    /**
     * 
     * @return nombre completo
     */
    public String imprimir() {
        return this.name + " " + this.surname;
    }
    
    public void correr(int run) {
        this.speed += run;
    }
    
    /**
     * 
     * @return velocidad total. 
     */
    public int speed() {
        return this.speed;
    }
    
    /**
     * 
     * @param distancePerson no tiene que ser superior a 1000
     */
    public void walk(int distancePerson){
        this.distance += distancePerson;
    }
    
    /**
     * 
     * @return distancia total recorrida.
     */
    public int distanceTotal() {
        return this.distance;
    }
    
    /**
     * 
     * @param gram 
     */
    public void eat (int gram) {
        this.gram += gram;
    }
    
    /**
     * 
     * @return gramos totales consumidos 
     */
    public int gramTotal() {
        return this.gram;
    }
    
    /**
     * 
     * @param cc 
     */
    public void cubicCentimeter (int cc) {
        this.cc = cc;
    }
    /**
     * 
     * @return total de centimetros cubicos de agua consumida.
     */
    public int ccTotal() {
        return this.cc;
    }
    
    /**
     * 
     * @param time tiempo en llegar a la meta.
     */
    public void timeGoal(int time){
        this.time = time;
    }
    
    /**
     * 
     * @return tiempo total 
     */
    public int timeTotal(){
        return this.time;
    }
    
    
    
}
