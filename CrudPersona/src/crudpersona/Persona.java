package crudpersona;

/**
 *
 * @author Adrian Verdugo
 * @version 1.0
 * @since 21-10-2017
 */
public class Persona {
    
    private String rut;
    private String nombre;
    private int edad;
    
    /**
     * 
     * @param rut de la persona
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String rut, String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }
    
    
    public Persona() {
        
    }
    
    /**
     * 
     * @return nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return  nombre de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * 
     * @return rut de la persona
     */
    public String getRut() {
        return rut;
    }
    
    /**
     * 
     * @param rut de la persona 
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
}
