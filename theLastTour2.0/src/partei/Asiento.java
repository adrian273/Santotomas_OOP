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
    
    public Asiento(int Numero, ReservaEstado Estado, Cliente tCliente, Bus tBus) {
        this.Numero = Numero;
        this.Estado = Estado;
        this.tCliente = tCliente;
        this.tBus = tBus;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public ReservaEstado getEstado() {
        return Estado;
    }

    public void setEstado(ReservaEstado Estado) {
        this.Estado = Estado;
    }

    public Cliente gettCliente() {
        return tCliente;
    }

    public void settCliente(Cliente tCliente) {
        this.tCliente = tCliente;
    }

    public Bus gettBus() {
        return tBus;
    }

    public void settBus(Bus tBus) {
        this.tBus = tBus;
    }

}
