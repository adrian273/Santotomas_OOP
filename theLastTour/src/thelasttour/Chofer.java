package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */
public class Chofer extends Tripulacion {
    
    private String tipoLicencia;
    
    /**
     * 
     * @param tipoLicencia
     * @param rut
     * @param nombre
     * @param apellido
     * @param numeroTelefono 
     */
    public Chofer(String tipoLicencia, String rut, String nombre, String apellido, int numeroTelefono) {
        super(rut, nombre, apellido, numeroTelefono);
        this.tipoLicencia = tipoLicencia;
    }
    
    /**
     * 
     * @param tipoLicencia 
     */
    public Chofer() {
       
    }
    
    /**
     * 
     * @return tipo de licencia
     */
    public String getTipoLicencia() {
        return tipoLicencia;
    }
    
    /**
     * 
     * @param tipoLicencia 
     */
    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
}
