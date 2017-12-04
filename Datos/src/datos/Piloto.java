package datos;

/**
 *
 * @author Adrian Verdugo
 * 
 **/

public class Piloto extends PersonalDeCabina {
    
    private int horaVuelo;
    
    /**
     * 
     * @param horaVuelo del piloto
     * @param nacionalidad del piloto
     * @param rut del piloto
     * @param nombre del piloto
     * @param apellido del piloto
     * @param edad del piloto
     */
    public Piloto(int horaVuelo, String nacionalidad, String rut, String nombre, String apellido, int edad) {
        super(nacionalidad, rut, nombre, apellido, edad);
        this.horaVuelo = horaVuelo;
    }
    
    /**
     * 
     * @param horaVuelo del piloto 
     */
    public Piloto(int horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public Piloto() {
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
