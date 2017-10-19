package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */
public class Asiento {
    
    private int numeroAsiento;
    private String estado;
    
    /**
     * 
     * @param numeroAsiento
     * @param estado 
     */
    public Asiento(int numeroAsiento, String estado) {
        this.numeroAsiento = numeroAsiento;
        this.estado = estado;
    }
    
    public Asiento() {
        
    }
    
    /**
     * 
     * @return numero del asiento del bus 
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }
    
    /**
     * 
     * @param numeroAsiento 
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    /**
     * 
     * @return estado del asiento 
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * 
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
