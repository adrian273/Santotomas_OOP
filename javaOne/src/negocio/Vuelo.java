package negocio;
import datos.*;
import java.util.HashMap;

/**
 *
 * @author Adrian Verdugo
 */
public class Vuelo {
    
    private Avion avion;
    private final HashMap<String, Pasajero> pasajero;
    
    /**
     * 
     * @param avion Clase Avion
     */
    public Vuelo(Avion avion) {
        this.avion = avion;
        this.pasajero = new HashMap<>();
    }
    
    /**
     * 
     * @return Datos del avion 
     */
    public Avion getAvion() {
        return avion;
    }
    
    /**
     * 
     * @param avion Datos del avion
     */
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    
}
