/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Adrian Verdugo
 */
public class Pasaje {
    
    private int numeroVuelo;
    private String fechaVuelo;
    private String horaVuelo;
    private String origenVuelo;
    private tipoDeClase tipoClase;
    private int valorPasaje;

    public Pasaje(int numeroVuelo, String fechaVuelo, String horaVuelo, String origenVuelo, tipoDeClase tipoClase, int valorPasaje) {
        this.numeroVuelo = numeroVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.origenVuelo = origenVuelo;
        this.tipoClase = tipoClase;
        this.valorPasaje = valorPasaje;
    }

}
