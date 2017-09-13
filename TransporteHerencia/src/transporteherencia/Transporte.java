
package transporteherencia;

/**
 *
 * @author Adrian Verdugo
 */
public abstract class Transporte {
    
    private String origen;
    private String destino;
    private int capacidad;
    private int velocidad;
    
    private int totalPasajero;
    private int totalBajarPasajero;
    private int totalSubirPasajero;

    public Transporte(String origen, String destino, int capacidad, int velocidad) {
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.totalPasajero = 0;
        this.totalBajarPasajero = 0;
        this.totalSubirPasajero = 0;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void subirPasajero(int pasajero){
        this.totalSubirPasajero = pasajero;
        this.totalPasajero += pasajero;
    }
    
    public void bajarPasajero(int pasajero){
        this.totalBajarPasajero = pasajero;
        this.totalPasajero -= pasajero;
    }
    
    public int getTotalPasajero(){
        return this.totalPasajero;
    }
    
    public int getTotalSubirPasajero(){
        return this.totalSubirPasajero;
    }
    
    public int getTotalBajarPasajero(){
        return this.totalBajarPasajero;
    }
    
}
