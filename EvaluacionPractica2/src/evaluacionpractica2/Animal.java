
package evaluacionpractica2;

/**
 *
 * @author Adrian Verdugo
 * 
 */
public class Animal {
    
    private String nombre;
    private String color;
    private int edad;
    
    private int aceleracion;
    private int litro;
    private int gramo;
    
    private int tiempoDormir;

    /**
     * 
     * @param nombre
     * @param color
     * @param edad 
     */
    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        
        this.aceleracion = 0;
        this.litro = 0;
        this.gramo = 0;
        
        this.tiempoDormir = 0;
    }
    
    
    public Animal() {
        this.aceleracion = 0;
        this.litro = 0;
        this.gramo = 0;
        
        this.tiempoDormir = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * 
     * @param aceleracion 
     */
    public void correr(int aceleracion){
        this.aceleracion += aceleracion;
    }
    
    /**
     * Aceleracion se reduce a 0
     */
    public void detenerse(){
        this.aceleracion = 0;
    }
    
    /**
     * 
     * @param litro 
     */
    public void beber(int litro){
        this.litro += litro;
    }
    
    /**
     * 
     * @param gramo 
     */
    public void comer(int gramo){
        this.gramo = gramo;
    }
    
    /**
     * 
     * @return aceleracion
     * Aceleracion total
     */
    public int totalAceleracion(){
        return this.aceleracion;
    }
    
    /**
     * 
     * @return litro
     * 
     */
    public int totalLitro(){
        return this.litro;
    }
    
    /**
     * 
     * @return gramo
     * Total de gramos consumidos por el animal
     */
    public int totalGramo(){
        return this.gramo;
    }
    
    /**
     * 
     * @param tiempoDormir 
     */
    public void dormir(int tiempoDormir){
        this.tiempoDormir += tiempoDormir;
    }
    
    /**
     * 
     * @return tiempoDormir 
     */
    public int getTiempoDormir(){
        return this.tiempoDormir;
    }
    
}
