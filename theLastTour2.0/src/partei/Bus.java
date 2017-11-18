/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partei;

/**
 *
 * @author user
 */
public class Bus {
    private String Patente;
    private int Capacidad;
    private String CiudadSalida;
    private String CiudadDestino;
    private String HoraSalida;
    private Chofer tChofer;
    private Azafata tAzafata;
    private Auxiliar tAuxiliar;
    
    private NuevoAsiento nuevoAsiento;

    public Bus(){
    
    }
    
    /**
     * 
     * @param Patente del bus
     * @param Capacidad de los asientos del bus
     * @param CiudadSalida ciudad de salida del bus
     * @param CiudadDestino ciudad de destino del bus
     * @param HoraSalida hora de salida del bus
     * @param tChofer datos del chofer
     * @param tAzafata datos de la azafata
     * @param tAuxiliar  datos del auxiliar
     */
    public Bus(String Patente, int Capacidad, String CiudadSalida, String CiudadDestino, String HoraSalida, Chofer tChofer, Azafata tAzafata, Auxiliar tAuxiliar) {
        this.Patente = Patente;
        this.Capacidad = Capacidad;
        this.CiudadSalida = CiudadSalida;
        this.CiudadDestino = CiudadDestino;
        this.HoraSalida = HoraSalida;
        this.tChofer = tChofer;
        this.tAzafata = tAzafata;
        this.tAuxiliar = tAuxiliar;
    }
    
    /**
     * 
     * @return los datos del auxiliar
     */
    public Auxiliar gettAuxiliar() {
        return tAuxiliar;
    }
    
    /**
     * 
     * @param tAuxiliar setea los datos del auxiliar 
     */
    public void settAuxiliar(Auxiliar tAuxiliar) {
        this.tAuxiliar = tAuxiliar;
    }
    
    /**
     * 
     * @return del bus
     */
    public String getPatente() {
        return Patente;
    }
    
    /**
     * 
     * @param Patente del bus 
     */
    public void setPatente(String Patente) {
        this.Patente = Patente;
    }
    
    /**
     * 
     * @return capacidad del bus
     */
    public int getCapacidad() {
        return Capacidad;
    }
    
    /**
     * 
     * @param Capacidad del bus
     */
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    /**
     * 
     * @return la ciudad de salida del bus XD
     */
    public String getCiudadSalida() {
        return CiudadSalida;
    }
    
    /**
     * 
     * @param CiudadSalida del bus
     */
    public void setCiudadSalida(String CiudadSalida) {
        this.CiudadSalida = CiudadSalida;
    }
    
    /**
     * 
     * @return ciudad de destino a cual se desea llegar XD
     */
    public String getCiudadDestino() {
        return CiudadDestino;
    }
    
    /**
     * 
     * @param CiudadDestino del bus
     */
    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }
    
    /**
     * 
     * @return hora de salida del bus
     */
    public String getHoraSalida() {
        return HoraSalida;
    }
    
    /**
     * 
     * @param HoraSalida 
     */
    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }
    
    /**
     * 
     * @return los datos de la clase chofer
     */
    public Chofer gettChofer() {
        return tChofer;
    }
    
    /**
     * 
     * @param tChofer clase chofer
     */
    public void settChofer(Chofer tChofer) {
        this.tChofer = tChofer;
    }
    
    /**
     * 
     * @return los datos de la azafata
     */
    public Azafata gettAzafata() {
        return tAzafata;
    }
    
    /**
     * 
     * @param tAzafata pasar clase azafata para setiarla 
     */
    public void settAzafata(Azafata tAzafata) {
        this.tAzafata = tAzafata;
    }
        
    /**
     * 
     * @return nuevo asiento reservado
     */
    public NuevoAsiento getAsiento(){
        return nuevoAsiento;
    }
    
    /**
     * 
     * @param asiento setiando el nuevo asiento
     */
    public void setNuevoAsiento (NuevoAsiento asiento) {
        this.nuevoAsiento = asiento;
    }
    
}
