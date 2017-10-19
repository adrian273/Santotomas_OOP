package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */
public class Cliente extends Persona {
    
    private String correo;
    
    /**
     * 
     * @param correo
     * @param rut
     * @param nombre
     * @param apellido
     * @param numeroTelefono 
     */
    public Cliente(String correo, String rut, String nombre, String apellido, int numeroTelefono) {
        super(rut, nombre, apellido, numeroTelefono);
        this.correo = correo;
    }
    
    public Cliente() {
        
    }
    
    /**
     * 
     * @return correo electronico del cliente
     */
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
    
}
