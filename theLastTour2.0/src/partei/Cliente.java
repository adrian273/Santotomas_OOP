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
public class Cliente extends Persona{
    private String Correo;
    
    /**
     * 
     * @param Correo del cliente
     * @param Rut del cliente
     * @param Nombre del cliente
     * @param Apellido del cliente
     * @param Telefono  del cliente
     */
    public Cliente(String Correo, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.Correo = Correo;
    }
    
    
    
    public Cliente() {
        
    }
  
    /**
     * 
     * @return correo del cliente; 
     */
    public String getCorreo() {
        return Correo;
    }
    
    /**
     * 
     * @param Correo setea el correo del cliente;
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
}
