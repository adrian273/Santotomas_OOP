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
public class Asiento {
    /**
     * Indica el numero de asiento
     */
    private int Numero;
    /**
     * Indica el estado del asiento (Libre u Ocupado)
     */
    private ReservaEstado Estado;
    /**
     * Indica el Cliente que reserva el Asiento
     */
    private Cliente tCliente;
    /**
     * Indica a que Bus pertenece el asiento
     */
    private Bus tBus;
    
    public Asiento(){
        this.Estado = ReservaEstado.LIBRE;
    }
    
    /**
     * 
     * @param Numero de asiento
     * @param Estado de asiento [libre o  ocudado]
     * @param tCliente datos del cliente a reservarlo
     * @param tBus bus de asiento
     */
    public Asiento(int Numero, ReservaEstado Estado, Cliente tCliente, Bus tBus) {
        this.Numero = Numero;
        this.Estado = Estado;
        this.tCliente = tCliente;
        this.tBus = tBus;
    }
    
    /**
     * 
     * @return nuemro de asiento 
     */
    public int getNumero() {
        return Numero;
    }
    
    /**
     * 
     * @param Numero de asiento 
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    /**
     * 
     * @return datos de las reserva de estados
     */
    public ReservaEstado getEstado() {
        return Estado;
    }
    
    /**
     * 
     * @param Estado recibe como parametro la reserva de estado
     */
    public void setEstado(ReservaEstado Estado) {
        this.Estado = Estado;
    }
    
    /**
     * 
     * @return datos del cliente
     */
    public Cliente gettCliente() {
        return tCliente;
    }
    
    /**
     * 
     * @param tCliente setaea los datos del cliente
     */
    public void settCliente(Cliente tCliente) {
        this.tCliente = tCliente;
    }
    
    /**
     * 
     * @return datos del bus
     */
    public Bus gettBus() {
        return tBus;
    }
    
    /**
     * 
     * @param tBus recibe como parametro los datos del bus
     */
    public void settBus(Bus tBus) {
        this.tBus = tBus;
    }

}
