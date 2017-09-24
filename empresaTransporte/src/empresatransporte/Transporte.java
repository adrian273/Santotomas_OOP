
package empresatransporte;

/**
 *
 * @author Adrian Verdugo
 */
public abstract class Transporte {
    
    private String patente;
    private String nombreChofer;
    private int capacidadPasajero;
    private String lugarSalida;
    private String lugarLlegada;
        
    private int llenadoCombustible;
    private int totalPasajero;
    
    private int totalSubidaPasajero;
    private int totalBajadaPasajero;
    
    /**
     * 
     * @param patente
     * @param nombreChofer
     * @param capacidadPasajero
     * @param lugarSalida
     * @param lugarLlegada 
     */
    public Transporte(String patente, String nombreChofer, int capacidadPasajero, String lugarSalida, String lugarLlegada) {
        this.patente = patente;
        this.nombreChofer = nombreChofer;
        this.capacidadPasajero = capacidadPasajero;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        
        this.llenadoCombustible = 0;
        this.totalPasajero = 0;
        
        this.totalSubidaPasajero = 0;
        this.totalBajadaPasajero = 0;
    }
    
    /**
     * 
     * @return 
     */
    public String getPatente() {
        return patente;
    }
    
    /**
     * 
     * @param patente 
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombreChofer() {
        return nombreChofer;
    }
    
    /**
     * 
     * @param nombreChofer 
     */
    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }
    
    /**
     * 
     * @return 
     */
    public int getCapacidadPasajero() {
        return capacidadPasajero;
    }
    
    /**
     * 
     * @param capacidadPasajero 
     */
    public void setCapacidadPasajero(int capacidadPasajero) {
        this.capacidadPasajero = capacidadPasajero;
    }
    
    /**
     * 
     * @return 
     */
    public String getLugarSalida() {
        return lugarSalida;
    }
    
    /**
     * 
     * @param lugarSalida 
     */
    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }
    
    /**
     * 
     * @return 
     */
    public String getLugarLlegada() {
        return lugarLlegada;
    }
    
    /**
     * 
     * @param lugarLlegada 
     */
    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }
    
    /**
     * 
     * @param combustible 
     */
    public void setLlenadoCombustible(int combustible) {
        this.llenadoCombustible = combustible;
    }
    
    /**
     * 
     * @param pasajero 
     */
    public void setSubidaPasajero(int pasajero) {
        this.totalPasajero += pasajero;
        this.totalSubidaPasajero = pasajero;
        if(this.totalPasajero > this.capacidadPasajero) {
            System.out.println("No quedan asientos disponibles");
            this.totalPasajero = this.capacidadPasajero;
        }
    }
    
    /**
     * 
     * @param pasajero 
     */
    public void setBajadaPasajero(int pasajero) {
        this.totalBajadaPasajero = pasajero;
        this.totalPasajero -= pasajero;
    }
     
    /**
     * 
     * @return la subida de pasajero por destino. 
     */
    public int getTotalSubidaPasajero() {
        return this.totalSubidaPasajero;
    }
    
    /**
     * 
     * @return total de pasajeros bajados 
     */
    public int getTotalBajadaPasajero() {
        return this.totalBajadaPasajero;
    }
    /**
     * 
     * @return total de pasajero subidos. 
     */
    public int getTotalPasajero() {
        return this.totalPasajero;
    }
    
}
