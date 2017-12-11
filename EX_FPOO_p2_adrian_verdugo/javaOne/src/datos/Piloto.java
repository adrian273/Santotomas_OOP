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

    @Override
    public String toString() {
        return "Piloto{" + "horaVuelo=" + horaVuelo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.horaVuelo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piloto other = (Piloto) obj;
        if (this.horaVuelo != other.horaVuelo) {
            return false;
        }
        return true;
    }

}
