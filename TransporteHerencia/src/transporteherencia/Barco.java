
package transporteherencia;

/**
 *
 * @author Adrian Verdugo
 */
public class Barco extends Transporte {
    
    private int numero_carro;
    
    public Barco(String origen, String destino, int capacidad, int velocidad, int numero_carro) {
        super(origen, destino, capacidad, velocidad);
        this.numero_carro = numero_carro;
    }

    public int getNumero_carro() {
        return numero_carro;
    }

    public void setNumero_carro(int numero_carro) {
        this.numero_carro = numero_carro;
    }
    
    
    
}
