/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partei;

/**
 *
 * @author Claudio Díaz
 */
public abstract class Persona {
    /**
     * Almacena el RUT de la Persona
    */
    private String Rut;
    private String Nombre;
    private String Apellido;
    private String Telefono;

    public Persona() {
    }
    
    /**
     * 
     * @param Rut de la persona
     * @param Nombre de la persona
     * @param Apellido de la persona
     * @param Telefono de la persona
     */
    public Persona(String Rut, String Nombre, String Apellido, String Telefono) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
    }

    /**
     * 
     * @return el apellido de la persona
     */
    public String getApellido() {
        return Apellido;
    }
    
    /**
     * 
     * @param Apellido setea el apellido de la persona
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    /**
     * 
     * @return rut de la persona
     */
    public String getRut() {
        return Rut;
    }
    
    /**
     * 
     * @param Rut  setea el rut de la persona
     */
    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    
    /**
     * 
     * @return nombre de la persona
     */
    public String getNombre() {
        return Nombre;
    }
    
    /***
     * 
     * @param Nombre  setea nombre de la de la persona
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } 
    
    /**
     * 
     * @return numero de telefono de la de la persona
     */
    public String getTelefono() {
        return Telefono;
    }
    
    /**
     * 
     * @param Telefono setea el telefono de la de la persona
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
