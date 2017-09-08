package evalucionpracticaavion;
import java.util.Random;

/**
 *
 * @author Adrian Verdugo
 * @version 2.0
 * @since 07-09-2017
 */

public class Avion {
    
    private int numero;
    private String empresa;
    private int numeroAsiento;
    
    private int cantidadPasajero;
    private int distancia;
    private int asientoDisponible;
    private int asientoDisponibleBajada;
    private int totalPasajero;
    private Random random;
    /**
     * 
     * @param numero
     * @param empresa
     * @param numeroAsiento 
     */
    public Avion(int numero, String empresa, int numeroAsiento) {
        this.numero = numero;
        this.empresa = empresa;
        this.numeroAsiento = numeroAsiento;
        
        this.cantidadPasajero = 0;
        this.distancia = 0;
        this.asientoDisponible = 0;
        this.asientoDisponibleBajada = 0;
        this.totalPasajero = 0;
    }

    public Avion() {
        this.cantidadPasajero = 0;
        this.distancia = 0;
        this.asientoDisponible = 0;
        this.totalPasajero = 0;
        this.asientoDisponibleBajada = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    /**
     * ------------------------------------------------------------------------|
     * @param pasajero
     */
    
    public void embarcar(int pasajero){
        this.cantidadPasajero += pasajero;
    }
    
    /**
     * 
     * @return cantidad de pasajeros totales 
     */
    public int getCantidadPasajero(){
        return this.cantidadPasajero;
    }
    
    /**
     * 
     * @param distancia 
     */
    public void despejar(int distancia){
        this.distancia = distancia + this.distancia;
    }
    
    /**
     * 
     * @return distancia recorrida total por el avion
     */
    public int getDistancia(){
        return this.distancia;
    }
    
    public void aterrizar(){
        System.out.println("Aterrizando..");
    }
    
    public void desembarcar(){
       random = new Random();
       int pasajeroBajada = random.nextInt(this.cantidadPasajero);
       this.totalPasajero = this.cantidadPasajero - pasajeroBajada;
       System.out.println("Total pasajeros bajados: " + pasajeroBajada);
       System.out.println("Total a bordo: " + totalPasajero);
    }
    
    /**
     * Asientos disponibles despues de la bajada de los pasajeros
     */
    public void setAsientoDisponible(){
        this.asientoDisponible = this.numeroAsiento - this.cantidadPasajero;
        if(this.asientoDisponible < 0){
            System.out.println("No hay asientos disponibles");
        }else{
            System.out.println("Asientos Disponibles:" + this.asientoDisponible);
        }
    }
    
    public int getAsientoDisponible(){
        return this.asientoDisponible;
    }
    
    public void setAsientoDisponibleBajada(){
        this.asientoDisponibleBajada = this.numeroAsiento - this.totalPasajero;
    }
    
    public int getAsientoDisponibleBajada(){
        return this.asientoDisponibleBajada;
    }
}
