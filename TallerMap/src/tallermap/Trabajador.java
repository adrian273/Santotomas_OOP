/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermap;

/**
 *
 * @author Claudio Díaz Pacheco
 */
public class Trabajador {
    /**
     * Aatributo que alamacenara el rut del trabajador
     */
    private String Rut;
    /**
     * Atributo que almacenara el nombre del trabajador
     */
    private String Nombre;
    /**
     * Atributo que almacenara el apellido del trabajador
     */
    private String Apellido;
    /**
     * Constructor vacio, utilizado para instanciar la clase
     */
    public Trabajador() {
    }
    /**
     * Construcctor, utilizado para instanciar la clase con parametros
     * @param Rut del trabajador
     * @param Nombre del trabajador
     * @param Apellido del trabajador
     */
    public Trabajador(String Rut, String Nombre, String Apellido) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    /**
     * Metodo que devuelve el apellido del trabajador
     * @return devuelve el apellido del trabajador
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * Metodo que setea el apellido del trabajador
     * @param Apellido parametro que trae el valor a setear
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * Metodo que devuelve el rut del trabajador
     * @return devuelve el rut
     */
    public String getRut() {
        return Rut;
    }
    /**
     * Metodo que setea el valor del rut
     * @param Rut parametro que trae el valor a setear
     */
    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    /**
     * Metodo que devuelve el apellido del trabajador
     * @return devuelve el apellido del trabajador
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Metodo que setea el valor del nombre del trabajador
     * @param Nombre parametro que trae el valor a setear
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Metodo que entrega el nombre completo del trabajador
     * @return un string que concatena el apellido y elnombre
     */
    public String Fullname(){
        return this.Apellido + ", " + this.Nombre;
    }
}
