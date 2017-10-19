package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */

public class Bus {
    
    private String patente;
    private int capacidad;
    private String ciudadSalida;
    private String ciudadDestino;
    private String horaSalida;
    private Chofer chofer;
    private Auxiliar auxiliar;
    private Azafata azafata;

    /**
     * 
     * @param patente
     * @param capacidad
     * @param ciudadSalida
     * @param ciudadDestino
     * @param horaSalida
     * @param chofer
     * @param auxiliar
     * @param azafata 
     */
    public Bus(String patente, int capacidad, String ciudadSalida, String ciudadDestino, String horaSalida, Chofer chofer, Auxiliar auxiliar, Azafata azafata) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.ciudadSalida = ciudadSalida;
        this.ciudadDestino = ciudadDestino;
        this.horaSalida = horaSalida;
        this.chofer = chofer;
        this.auxiliar = auxiliar;
        this.azafata = azafata;
    }
    
    
    public Bus() {
        this.chofer = new Chofer();
        this.auxiliar = new Auxiliar();
        this.azafata = new Azafata();
    }
    
    /**
     * 
     * @return patente del bus 
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
     * @return capacidad del bus
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    /**
     * 
     * @param capacidad 
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * 
     * @return ciudad de salida del bus
     */
    public String getCiudadSalida() {
        return ciudadSalida;
    }
    
    /**
     * 
     * @param ciudadSalida 
     */
    public void setCiudadSalida(String ciudadSalida) {
        this.ciudadSalida = ciudadSalida;
    }
    
    /**
     * 
     * @return ciudad del destino del bus
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    /**
     * 
     * @param ciudadDestino 
     */
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
    /**
     * 
     * @return hora de salida del bus
     */
    public String getHoraSalida() {
        return horaSalida;
    }
    
    /**
     * 
     * @param horaSalida 
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    /**
     * 
     * @return datos de chofer 
     */
    public Chofer getChofer() {
        return chofer;
    }
    
    /**
     * 
     * @return datos del auxiliar 
     */
    public Auxiliar getAuxiliar() {
        return auxiliar;
    }
    
    /**
     * 
     * @return datos de la azafata 
     */
    public Azafata getAzafata() {
        return azafata;
    }
    
    /**
     * 
     * @param chofer 
     */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
    
    /**
     * 
     * @param auxiliar 
     */
    public void setAuxiliar(Auxiliar auxiliar) {
        this.auxiliar = auxiliar;
    }
    
    /**
     * 
     * @param azafata 
     */
    public void setAzafata(Azafata azafata) {
        this.azafata = azafata;
    }
    
}
