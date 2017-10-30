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

    public Bus(){
    
    }
    
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

    public Auxiliar gettAuxiliar() {
        return tAuxiliar;
    }

    public void settAuxiliar(Auxiliar tAuxiliar) {
        this.tAuxiliar = tAuxiliar;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getCiudadSalida() {
        return CiudadSalida;
    }

    public void setCiudadSalida(String CiudadSalida) {
        this.CiudadSalida = CiudadSalida;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public Chofer gettChofer() {
        return tChofer;
    }

    public void settChofer(Chofer tChofer) {
        this.tChofer = tChofer;
    }

    public Azafata gettAzafata() {
        return tAzafata;
    }

    public void settAzafata(Azafata tAzafata) {
        this.tAzafata = tAzafata;
    }
    
    
}
