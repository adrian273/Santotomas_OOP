package datos;

/**
 *
 * @author Adrian Verdugo
 * 
 **/

public class Piloto extends PersonalDeCabina {
    
    private int horaVuelo;

    public Piloto(int horaVuelo, String nacionalidad, int edad, String rut, String nombre, String apellido) {
        super(nacionalidad, edad, rut, nombre, apellido);
        this.horaVuelo = horaVuelo;
    }
    
    /**
     * 
     * @return hora de vuelo del piloto
     * 
     */
    public int getHoraVuelo() {
        return horaVuelo;
    }
    
    /**
     * 
     * @param horaVuelo del piloto
     */
    public void setHoraVuelo(int horaVuelo) {
        this.horaVuelo = horaVuelo;
    }
    
    
    
    
}
