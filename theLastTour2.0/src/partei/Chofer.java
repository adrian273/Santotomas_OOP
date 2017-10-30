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
public class Chofer extends Tripulacion {
    
    private TipoLicencia Licencia;

    public Chofer() {
        this.Licencia = TipoLicencia.A2;
    }

    public Chofer(TipoLicencia Licencia, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.Licencia = Licencia;
    }

    public TipoLicencia getLicencia() {
        return Licencia;
    }

    public void setLicencia(TipoLicencia Licencia) {
        this.Licencia = Licencia;
    }

}
