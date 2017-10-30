
package partei;

/**
 *
 * @author user
 */
public class Azafata extends Tripulacion{
    private int edad;

    public Azafata() {
        
    }

    public Azafata(int edad, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
