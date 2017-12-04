package datos;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.pasaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pasajero other = (Pasajero) obj;
        if (!Objects.equals(this.pasaje, other.pasaje)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "pasaje=" + pasaje + '}';
    }
    
    
    
}
