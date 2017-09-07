package evaluacionpractica2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian Verdugo
 * @version 1.0
 * @since 07-09-2017
 */
public class EvaluacionPractica2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        String nombre, color;
        int edad;
        final int TOPE_COMER = 1000, TOPE_BEBER = 1000, 
                  TOPE_CORRER = 5, TOPE_DORMIR = 3;
        
        System.out.println("Nombre: ");
        nombre = input.next();
        System.out.println("Color: ");
        color = input.next();
        System.out.println("Edad: ");
        edad = input.nextInt();

        Animal a = new Animal(nombre, color, edad);
        
        // metodo comer
        a.comer(random.nextInt(TOPE_COMER));
        a.comer(random.nextInt(TOPE_COMER));
        a.comer(random.nextInt(TOPE_COMER));
        
        // metodo beber
        a.beber(random.nextInt(TOPE_BEBER));
        a.beber(random.nextInt(TOPE_BEBER));
        a.beber(random.nextInt(TOPE_BEBER));
        a.beber(random.nextInt(TOPE_BEBER));
        a.beber(random.nextInt(TOPE_BEBER));
        
        // metodo Correr
        a.correr(random.nextInt(TOPE_CORRER));
        a.correr(random.nextInt(TOPE_CORRER));
        a.correr(random.nextInt(TOPE_CORRER));
        
        // metodo dormir
        a.dormir(random.nextInt(TOPE_DORMIR));
        a.dormir(random.nextInt(TOPE_DORMIR));
        
        System.out.println("Aceleracion: " + a.totalAceleracion() + " K/Hrs");
        System.out.println("Litro bebidos: " + a.totalLitro() + "cc");
        System.out.println("Gramos comidos: " + a.totalGramo() + "gr");
        System.out.println("Horas dormidas: " + a.getTiempoDormir() + "hrs");
        a.detenerse();
        System.out.println("Velocidad detenida: " + a.totalAceleracion() + " K/Hrs");
        
        /**
         * Animal 2
         * --------------------------------------------------------------------|
         */
        System.out.println("Nombre: ");
        nombre = input.next();
        System.out.println("Color: ");
        color = input.next();
        System.out.println("Edad: ");
        edad = input.nextInt();

        Animal a1 = new Animal(nombre, color, edad);
        
        // metodo comer
        a1.comer(random.nextInt(TOPE_COMER));
        a1.comer(random.nextInt(TOPE_COMER));
        a1.comer(random.nextInt(TOPE_COMER));
        
        // metodo beber
        a1.beber(random.nextInt(TOPE_BEBER));
        a1.beber(random.nextInt(TOPE_BEBER));
        a1.beber(random.nextInt(TOPE_BEBER));
        a1.beber(random.nextInt(TOPE_BEBER));
        a1.beber(random.nextInt(TOPE_BEBER));
        
        // metodo Correr
        a1.correr(random.nextInt(TOPE_CORRER));
        a1.correr(random.nextInt(TOPE_CORRER));
        a1.correr(random.nextInt(TOPE_CORRER));
        
        // metodo dormir
        a1.dormir(random.nextInt(TOPE_DORMIR));
        a1.dormir(random.nextInt(TOPE_DORMIR));
        
        System.out.println("Aceleracion: " + a1.totalAceleracion() + " K/Hrs");
        System.out.println("Litro bebidos: " + a1.totalLitro() + "cc");
        System.out.println("Gramos comidos: " + a1.totalGramo() + "gr");
        System.out.println("Horas dormidas: " + a1.getTiempoDormir() + "hrs");
        a1.detenerse();
        System.out.println("Velocidad detenida: " + a1.totalAceleracion() + " K/Hrs");
        
        /**
         * Animal 3
         * --------------------------------------------------------------------|
         */
        System.out.println("Nombre: ");
        nombre = input.next();
        System.out.println("Color: ");
        color = input.next();
        System.out.println("Edad: ");
        edad = input.nextInt();

        Animal a2 = new Animal(nombre, color, edad);
        
        // metodo comer
        a2.comer(random.nextInt(TOPE_COMER));
        a2.comer(random.nextInt(TOPE_COMER));
        a2.comer(random.nextInt(TOPE_COMER));
        
        // metodo beber
        a2.beber(random.nextInt(TOPE_BEBER));
        a2.beber(random.nextInt(TOPE_BEBER));
        a2.beber(random.nextInt(TOPE_BEBER));
        a2.beber(random.nextInt(TOPE_BEBER));
        a2.beber(random.nextInt(TOPE_BEBER));
        
        // metodo Correr
        a2.correr(random.nextInt(TOPE_CORRER));
        a2.correr(random.nextInt(TOPE_CORRER));
        a2.correr(random.nextInt(TOPE_CORRER));
        
        // metodo dormir
        a2.dormir(random.nextInt(TOPE_DORMIR));
        a2.dormir(random.nextInt(TOPE_DORMIR));
        
        System.out.println("Aceleracion: " + a2.totalAceleracion() + " K/Hrs");
        System.out.println("Litro bebidos: " + a2.totalLitro() + "cc");
        System.out.println("Gramos comidos: " + a2.totalGramo() + "gr");
        System.out.println("Horas dormidas: " + a2.getTiempoDormir() + "hrs");
        a2.detenerse();
        System.out.println("Velocidad detenida: " + a2.totalAceleracion() + " K/Hrs");
    }
    
}
