package datos;

/**
 *
 * @author Adrian Verdugo
 */

public abstract class Persona {
    
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    
    /**
     * 
     * @param rut de la persona
     * @param nombre de la persona
     * @param apellido de la persona
     * @param edad de la persona
     */
    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /**
     * 
     * @return el rut de la persona
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
    
    /**
     * 
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return apellido de la persona 
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * 
     * @param apellido de la persona 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * 
     * @return el nombre y apellido completo de la persona 
     */
    public String getFullName() {
        return this.getNombre() + " " + this.getApellido();
    }
    
}
