package datos;

/**
 *
 * @author Adrian Verdugo
 * 
 */

public class Pasajero extends Persona {
    
    private Pasaje pasaje;
    
    /**
     * 
     * @param pasaje del pasajero XD
     * @param rut del pasajero
     * @param nombre del pasajero
     * @param apellido del pasajero
     * @param edad  del pasajero
     */
    public Pasajero(Pasaje pasaje, String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
        this.pasaje = pasaje;
    }
    
    /**
     * 
     * @param pasaje del pasajero 
     */
    public Pasajero(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    
    public Pasajero() {
    }
    
    /**
     * 
     * @return pasaje  
     */
    public Pasaje getPasaje() {
        return pasaje;
    }
    
    /**
     * 
     * @param pasaje del viajero 
     */
    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    
    
    
}
