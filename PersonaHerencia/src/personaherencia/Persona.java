
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 */

public abstract class Persona {
    
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;

    /**
     * 
     * @param rut
     * @param nombre
     * @param apellido
     * @param correo 
     */
    
    public Persona(String rut, String nombre, String apellido, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public Persona() {
        
    }

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
    
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * 
     * @return nombre completo XD
     */
    public String nombreCompleto(){
        return this.apellido + ", " + this.nombre;
    }
    
}
