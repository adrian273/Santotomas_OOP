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
public class Auxiliar extends Tripulacion{
    private String Telefono_E;

    public Auxiliar() {
        
    }

    public Auxiliar(String Telefono_E, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.Telefono_E = Telefono_E;
    }

    public String getTelefono_E() {
        return Telefono_E;
    }

    public void setTelefono_E(String Telefono_E) {
        this.Telefono_E = Telefono_E;
    }
    
}
