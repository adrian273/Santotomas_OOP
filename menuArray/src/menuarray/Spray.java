/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarray;

/**
 *
 * @author kdr
 */
public class Spray {
    
    private String marca;
    private String color;

    public Spray(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    
    public Spray(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
       
}
