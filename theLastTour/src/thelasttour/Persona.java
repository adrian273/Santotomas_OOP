package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */

public abstract class Persona {
    
    private String rut;
    private String nombre;
    private String apellido;
    private int numeroTelefono;
    
    /**
     * 
     * @param rut
     * @param nombre
     * @param apellido
     * @param numeroTelefono 
     */
    public Persona(String rut, String nombre, String apellido, int numeroTelefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
    }
    
    public Persona() {
        
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
     * @param rut 
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * 
     * @return nonbre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre 
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
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * 
     * @return numero telefonico 
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    
    /**
     * 
     * @param numeroTelefono 
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
}
