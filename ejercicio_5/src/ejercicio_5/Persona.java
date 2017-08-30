/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author kdr
 */
public class Persona {
    
    //private String rut;
    private String name;
    private String surname;
    //private int age;
    private int speed;
    /**
     * 
     * @param rut
     * @param name
     * @param surname
     * @param age 
     */
    public Persona( String name, String surname) {
        //this.rut = rut;
        this.name = name;
        this.surname = surname;
        //this.age = age;
        this.speed = 0;
    }
    
    /**
     * consytructor vacio
     */
    public Persona() {
        this.speed = 0;
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
    
    public String imprimir() {
        return this.name + " " + this.surname;
    }
    
    public void correr(int run) {
        this.speed += run;
    }
    
    public int speed() {
        return this.speed;
    }
    
    
}
