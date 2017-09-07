/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionpractica;

/**
 *
 * @author Adrian Verdugo
 * @since 6-09-2017
 * @version 1.0
 */
public class Avion {
    
    private int numero;
    private String empresa;
    private int numAsiento;
    
    private int pasajero;
    private int distancia;
    private int litroBencina;
    private int asientoDisponibles;
    
    /**
     * 
     * @param numero
     * @param empresa
     * @param numAsiento 
     */    
    public Avion(int numero, String empresa, int numAsiento) {
        this.numero = numero;
        this.empresa = empresa;
        this.numAsiento = numAsiento;
        
        this.pasajero = 0;
        this.litroBencina = 0;
        this.asientoDisponibles = 0;
    }

    public Avion() {
        this.pasajero = 0;
        
        this.litroBencina = 0;
        this.asientoDisponibles = 0;
    }

    /**
     * 
     * @return numero de avion
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * 
     * @return nombre de empresa 
     */
    public String getEmpresa() {
        return empresa;
    }
    
    /**
     * 
     * @param empresa 
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    /**
     * 
     * @return numero de Asientos
     */
    public int getNumAsiento() {
        return numAsiento;
    }
    
    /**
     * 
     * @param numAsiento 
     */
    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
    
    /**
     * 
     * @param pasajero Numero de subida de pasajeros. 
     */
    public void embarcar(int pasajero){
        this.pasajero += pasajero;
    }
    
    /**
     * 
     * @return pasajero Pasajeros Totales
     */
    public int getPasajero(){
        return this.pasajero;
    }
    
    /***
     * 
     * @param distancia 
     */
    public void despejar(int distancia){
        this.distancia += distancia;
    }
    
    /**
     * 
     * @return distancia Total de distancia recorrida. 
     */
    public int totalDespejar(){
        return this.distancia;
    }
    
    /**
     * 
     * @return TEXTO
     */
    public String aterrizar(){
        return "Aterrizando ...";
    }
    
    /**
     * 
     * @param asientoDisponible
     * Al desembarcar los pasajeros quedan asientos disponibles
     * esto se usara para ingresar nuevos pasajeros al avion
     * 
     */
    public void desembarcar(int asientoDisponibles){
        this.asientoDisponibles = asientoDisponibles;
        
    }
    
    /**
     * 
     * @return asientoDisponibles 
     * Asientos totales que quedaron disponibles despues de la
     * bajada de los pasajeros.
     */
    public int asientoDisponible(){
        int resta = this.pasajero - this.asientoDisponibles;
        return resta;
    }
    
    /**
     * 
     * @param litro de bencina acumulados en el viaje.
     */
    public void setLitroBencina(int litro){
        this.litroBencina += litro;
    }
    
    /**
     * 
     * @return litros de bencina utilizados en el vuelo
     */
    public int getLitroBencina(){
        return this.litroBencina;
    }
}
