package datos;

/**
 *
 * @author Adrian Verdugo
 */
public class Pasaje {
    
    private int numeroVuelo;
    private String fechaVuelo;
    private String horaVuelo;
    private String origenVuelo;
    private tipoDeClase tipoClase;
    private int valorPasaje;
    
    /**
     * 
     * @param numeroVuelo del pasaje
     * @param fechaVuelo del pasaje
     * @param horaVuelo del pasaje
     * @param origenVuelo del pasaje
     * @param tipoClase del pasaje 
     * @param valorPasaje del pasaje
     */
    public Pasaje(int numeroVuelo, String fechaVuelo, String horaVuelo, String origenVuelo, tipoDeClase tipoClase, int valorPasaje) {
        this.numeroVuelo = numeroVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.origenVuelo = origenVuelo;
        this.tipoClase = tipoClase;
        this.valorPasaje = valorPasaje;
    }

    public Pasaje() {
    }
    
    
    
    /**
     * 
     * @return nuemro del pasaje
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }
    
    /**
     * 
     * @param numeroVuelo del pasaje
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }
    
    /**
     * 
     * @return fecha de vuelo del pasaje
     */
    public String getFechaVuelo() {
        return fechaVuelo;
    }
    
    /**
     * 
     * @param fechaVuelo del pasaje 
     */
    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
    
    /**
     * 
     * @return hora de vuelo del pasaje 
     */
    public String getHoraVuelo() {
        return horaVuelo;
    }
    
    /**
     * 
     * @param horaVuelo del pasaje 
     */
    public void setHoraVuelo(String horaVuelo) {
        this.horaVuelo = horaVuelo;
    }
    
    /**
     * 
     * @return origen del vuelo [pasaje] 
     */
    public String getOrigenVuelo() {
        return origenVuelo;
    }
    
    /**
     * 
     * @param origenVuelo [pasaje] 
     */
    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }
    
    /**
     * 
     * @return tipo de clasePasaje[econoimico, ejecutivo]
     */
    public tipoDeClase getTipoClase() {
        return tipoClase;
    }
    
    /**
     * 
     * @param tipoClase del pasaje 
     */
    public void setTipoClase(tipoDeClase tipoClase) {
        this.tipoClase = tipoClase;
    }
    
    /**
     * 
     * @return valor del pasaje
     */
    public int getValorPasaje() {
        return valorPasaje;
    }
    
    /**
     * 
     * @param valorPasaje del pasaje
     */
    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
   
}
