package negocio;

import java.util.Objects;

/**
 *
 * @author Adrian Verdugo
 */
public class Avion {
    
    private String marca;
    private String modelo;
    private int capacidadPasajero;
    private int codigoInterno;
    static int codigoDisponible;
    
    /**
     * 
     * @param marca marca del avion
     * @param modelo modelo del avion
     * @param capacidadPasajero capacidad total del avion
     */
    public Avion(String marca, String modelo, int capacidadPasajero) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadPasajero = capacidadPasajero;
        codigoDisponible = 1;
    }

    public Avion() {
    }
    
    /**
     * 
     * @return la marca del avion 
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * 
     * @param marca del avion
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * 
     * @return el modelo del avion 
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * 
     * @param modelo del avion
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * 
     * @return capacidad del avion
     */
    public int getCapacidadPasajero() {
        return capacidadPasajero;
    }
    
    /**
     * 
     * @param capacidadPasajero capacidad el avion
     */
    public void setCapacidadPasajero(int capacidadPasajero) {
        this.capacidadPasajero = capacidadPasajero;
    }
    
    /**
     * 
     * @return codigo interno del avion disponible se incrementa en 1 
     */
    public int getCodigoInterno() {
        return codigoInterno += codigoDisponible;
    }
    
    /**
     * 
     * @param codigoInterno codigo interno del avion
     */
    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Avion other = (Avion) obj;
        if (this.capacidadPasajero != other.capacidadPasajero) {
            return false;
        }
        if (this.codigoInterno != other.codigoInterno) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avion{" + "marca=" + marca + ", modelo=" + modelo + ", capacidadPasajero=" + capacidadPasajero + ", codigoInterno=" + codigoInterno + '}';
    }
    
    /**
     * 
     * @return metodo de impresion
     */
    public String print() {
        return this.getCapacidadPasajero() + this.getMarca() + " " + this.getModelo() + " ";
    }
    
}
