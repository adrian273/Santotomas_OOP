
package transporteherencia;

/**
 *
 * @author Adrian Verdugo
 */
public class Tren extends Transporte {
    
    private int capacidad_vehiculo;
    
    public Tren(String origen, String destino, int capacidad, int velocidad, int capacidad_vehiculo) {
        super(origen, destino, capacidad, velocidad);
        this.capacidad_vehiculo = capacidad_vehiculo;
    }

    public int getCapacidad_vehiculo() {
        return capacidad_vehiculo;
    }

    public void setCapacidad_vehiculo(int capacidad_vehiculo) {
        this.capacidad_vehiculo = capacidad_vehiculo;
    }
    
    
    
    
}
