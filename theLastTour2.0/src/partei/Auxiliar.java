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
public class Auxiliar extends Tripulacion {
    
    /**
     * telefono de emergencia
     */
    private String Telefono_E;

    public Auxiliar() {
        
    }
    
    /**
     * 
     * @param Telefono_E del auxiliar
     * @param Rut del auxiliar
     * @param Nombre del auxiliar
     * @param Apellido del auxiliar
     * @param Telefono del auxiliar
     */
    public Auxiliar(String Telefono_E, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.Telefono_E = Telefono_E;
    }
    
    /**
     * 
     * @return telefono de emergencia del auxiliar
     */
    public String getTelefono_E() {
        return Telefono_E;
    }
    
    /**
     * 
     * @param Telefono_E tipo String telefono de emergencia del auxiliar
     */
    public void setTelefono_E(String Telefono_E) {
        this.Telefono_E = Telefono_E;
    }
    
}
