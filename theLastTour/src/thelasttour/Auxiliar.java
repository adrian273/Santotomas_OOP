package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */
public class Auxiliar extends Tripulacion {
    
    private String telefonoEmergencia;
    
    /**
     * 
     * @param telefonoEmergencia
     * @param rut
     * @param nombre
     * @param apellido
     * @param numeroTelefono 
     */
    public Auxiliar(String telefonoEmergencia, String rut, String nombre, String apellido, int numeroTelefono) {
        super(rut, nombre, apellido, numeroTelefono);
        this.telefonoEmergencia = telefonoEmergencia;
    }
    
    public Auxiliar(){
        
    }
    
    /**
     * 
     * @return telefono de emergencia
     */
    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }
    
    /**
     * 
     * @param telefonoEmergencia 
     */
    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }
    
    
}
